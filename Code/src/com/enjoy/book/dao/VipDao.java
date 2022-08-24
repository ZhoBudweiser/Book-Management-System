package com.enjoy.book.dao;

import com.enjoy.book.bean.Vip;
import com.enjoy.book.util.DBHelper;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class VipDao {
    QueryRunner  runner = new QueryRunner();

    /**
     * 查询所有的会员类型
     * @return
     * @throws SQLException
     */
    public List<Vip> getAll() throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql="select * from v_v_all order by vipDeposit asc";
        List<Vip> vip = runner.query(conn,sql,new BeanListHandler<Vip>(Vip.class));
        DBHelper.close(conn);
        return vip;
    }
    public int add(String  name, double  deposit, double  rentDiscount, double  sellDiscount, long    borrowNum,
                   long    renew, long    borrowDate, long    time, double  overdue, double  damage, double  lose)
            throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql="insert into v_v_all values(?,?,?,?,?,?,?,?,?,?,?)";
        int count = runner.update(conn,sql, name, deposit, rentDiscount, sellDiscount, borrowNum, renew,
                borrowDate, time, overdue, damage, lose);
        DBHelper.close(conn);
        return count;
    }
    public int remove(String id) throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql="delete from v_v_all where vipName=?";
        int count = runner.update(conn,sql,id);
        DBHelper.close(conn);
        return count;
    }
    /**
     * 根据会员类型编号查询对应的会员类型
     * @param id
     * @return
     * @throws SQLException
     */
    public Vip getById(String id) throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql="select * from v_v_all where vipName=?";
        Vip vip= runner.query(conn,sql,new BeanHandler<Vip>(Vip.class),id);
        DBHelper.close(conn);
        return vip;
    }
    public int modify(String  name, double  deposit, double  rentDiscount, double  sellDiscount, long    borrowNum,
                      long    renew, long    borrowDate, long    time, double  overdue, double  damage, double  lose)
            throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql="UPDATE `v_v_all` SET `vipDeposit` = ?, `vipRentDiscount` = ?, `vipSellDiscount` = ?, " +
                "`vipBorrowNum` = ?, `vipRenew` = ?, `vipBorrowDate` = ?, `vipTime` = ?, `vipOverdue` = ?, " +
                "`vipDamage` = ?, `vipLose` = ? WHERE `vipName` = ?;";
        int count = runner.update(conn,sql, deposit, rentDiscount, sellDiscount, borrowNum, renew,
                borrowDate, time, overdue, damage, lose, name);
        DBHelper.close(conn);
        return count;
    }
}
