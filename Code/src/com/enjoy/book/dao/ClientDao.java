package com.enjoy.book.dao;

import com.enjoy.book.bean.Client;
import com.enjoy.book.bean.Vip;
import com.enjoy.book.util.DBHelper;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ClientDao {
    QueryRunner runner = new QueryRunner();

    /**
     * 添加会员
     * @param name
     * @param pwd
     * @param typeId
     * @param balance
     * @param tel
     * @param idNumber
     * @return
     * @throws SQLException
     */
    public int add(String phone, String name, String sex, String grade, double balance, String Status, long borrorwNum) throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql="INSERT INTO `client`(`clientPhone`, `clientName`, `clientSex`, `clientGrade`," +
                "`clientBalance`, `clientStatus`, `clientBorrowNum`) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?);";
        int count = runner.update(conn,sql,phone,name,sex,grade,balance,Status,borrorwNum);
        DBHelper.close(conn);
        return count;
    }
    public int modify(String phone, String name, String sex, String grade) throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql="UPDATE v_c_info SET `clientName` = ?, `clientSex` = ?, `clientGrade` = ? WHERE `clientPhone` = ?;";
        int count = runner.update(conn,sql,name,sex,grade,phone);
        DBHelper.close(conn);
        return count;
    }
    public int remove(String id) throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql="update v_c_status set `clientStatus` = '注销' where clientPhone=?; ";
        int count = runner.update(conn,sql,id);
        DBHelper.close(conn);
        return count;
    }
//
//    /**
//     * 会员的身份证号码
//     * @param idNumber
//     * @param amount
//     * @return
//     * @throws SQLException
//     */
    public int modifyBalance(String idNumber,double amount) throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql="update v_c_info set clientBalance = clientBalance + ? where clientPhone = ?;";
        int count = runner.update(conn,sql,amount,idNumber);
        DBHelper.close(conn);
        return count;
    }
//
//    /**
//     * 修改押金
//     * @param id
//     * @param amount >0: 归还+   <0:借书-押金
//     * @return
//     * @throws SQLException
//     */
//    public int modifyBalance(long id,double amount) throws SQLException {
//        Connection conn = DBHelper.getConnection();
//        String sql="update member set balance = balance + ? where id = ?";
//        int count = runner.update(conn,sql,amount,id);
//        DBHelper.close(conn);
//        return count;
//    }
//
    public List<Client> getAll() throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql="select `clientPhone`, `clientName`, `clientSex`, `clientGrade`,`clientBalance`, `clientStatus`, `clientBorrowNum` from client;";
        List<Client> members = runner.query(conn,sql,new BeanListHandler<Client>(Client.class));
        DBHelper.close(conn);
        return  members;
    }

    /**
     * 根据会员编号查会员信息
     * @param id
     * @return
     * @throws SQLException
     */
    public Client getById(String id) throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql="select `clientPhone`, `clientName`, `clientSex`, `clientGrade`,`clientBalance`, `clientStatus`, `clientBorrowNum` from client where `clientPhone`=?";
        Client member = runner.query(conn,sql,new BeanHandler<Client>(Client.class),id);
        DBHelper.close(conn);
        return  member;
    }

//    /**
//     * 根据会员身份证查会员信息
//     * @paramidNumber
//     * @return
//     * @throws SQLException
//     */
//    public Client getByIdNumber(String idNumber) throws SQLException {
//        Connection conn = DBHelper.getConnection();
//        String sql="select * from member where idNumber=?";
//        Client member = runner.query(conn,sql,new BeanHandler<Client>(Client.class),idNumber);
//        DBHelper.close(conn);
//        return  member;
//    }


    /**
     * 判断会员是否有存在未还的书刊
     * @param id
     * @return
     */
    public boolean exits(String id) throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql="select COUNT(*) from v_c_b_bw where clientPhone= ? and returnDate is null ";
        Number number = runner.query(conn,sql,new ScalarHandler<>(),id);
        DBHelper.close(conn);
        return number.intValue()>0?true:false;
    }

    public List<Vip> getByVipId(String id) throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql="select * from v_c_info where clientGrade=?";
        List<Vip> vips = runner.query(conn,sql,new BeanListHandler<Vip>(Vip.class),id);
        DBHelper.close(conn);
        return vips;
    }

    public static void main(String[] args) {
        ClientDao dao  = new ClientDao();
    }
}
