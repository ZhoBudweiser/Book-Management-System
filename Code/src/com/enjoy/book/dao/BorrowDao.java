package com.enjoy.book.dao;

import com.enjoy.book.bean.Borrow;
import com.enjoy.book.util.DBHelper;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class BorrowDao {
    QueryRunner runner = new QueryRunner();
    public List<Borrow> getRecordByClientPhone(String clientPhone, String bookIsbn) throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql ="select * from borrow where clientPhone=?, bookIsbn=?";
        List<Borrow> borrows = runner.query(conn,sql,new BeanListHandler<Borrow>(Borrow.class),clientPhone,bookIsbn);
        DBHelper.close(conn);
        return borrows;
    }
    //    /**
//     * 根据用户的身份证号查询用户借阅信息
//     * @param idNum
//     * @return
//     */
    public List<Borrow> getRecordsByIdNum(String clientPhone) throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql ="select * from borrow where clientPhone = ?";
        List<Borrow> borrows = runner.query(conn,sql,new BeanListHandler<Borrow>(Borrow.class), clientPhone);
        DBHelper.close(conn);
        return borrows;
    }
//
//    /**
//     * 根据用户的会员编号查询用户借阅信息
//     * @param memberId
//     * @return
//     */

    public List<Borrow> getRecordsByMemberId(String memberId) throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql ="select * from borrow where clientPhone = ? and returnDate is null";
        List<Borrow> records = runner.query(conn,sql,new BeanListHandler<Borrow>(Borrow.class),memberId);
        DBHelper.close(conn);
        return records;
    }

    /**
     * 添加借阅记录
     * @param memberId
     * @param bookId
     * @return
     * @throws SQLException
     */
    public int add(String memberId,String bookId) throws SQLException {
        String sql="call insertBorrow(?, ?);";
        Connection conn = DBHelper.getConnection();
        int count = runner.execute(conn,sql,memberId,bookId);
        DBHelper.close(conn);
        return count;
    }
    /**
     *
     * @param deposit 过期归还，>0  准时归还:清零
     * @param userId 管理员编号
     * @param id 记录编号
     * @return
     */
    public  int modify(String clientPhone,String deductionType,long deductionAmount) throws SQLException {
        String sql = "update  borrow set returnDate = CURRENT_DATE,deductionType = ?,deductionAmount = ? where clientPhone = ? and returnDate is null";
        Connection conn = DBHelper.getConnection();
        int count = runner.update(conn,sql,deductionType,deductionAmount,clientPhone);
        DBHelper.close(conn);
        return count;
    }

    public  int modify(String clientPhone, String bookIsbn) throws SQLException {
        String sql = "update  borrow set returnDate = CURRENT_DATE where clientPhone = ? and bookISBN = ?";
        Connection conn = DBHelper.getConnection();
        int count = runner.update(conn,sql,clientPhone,bookIsbn);
        DBHelper.close(conn);
        return count;
    }


    /**
     * 查手机号获取所有的书籍
     * @param clientPhone
     * @return
     * @throws SQLException
     */
    public Borrow getById(String clientPhone) throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql ="select * from borrow where bookISBN = ? ";
        Borrow borrow = runner.query(conn,sql,new BeanHandler<Borrow>(Borrow.class),clientPhone);
        DBHelper.close(conn);
        return borrow;
    }
//
//    /**
//     * 全部:0
//     *     已归还:1
//     *    未归还 :2
//     *    最近一周需归还:3
//     * @param typeId
//     * @param keyWork
//     * @return
//     * @throws SQLException
//     */
//
    public List<Map<String,Object>> query(int typeId, String keyWork) throws SQLException {
        Connection conn = DBHelper.getConnection();
        StringBuilder sb = new StringBuilder("select * from v_c_b_bw where 1=1 ");
        switch (typeId){
            case 0:
                break;
            case 1:
                sb.append("and  returnDate is not null ");
                break;
            case 2:
                sb.append("and  returnDate is  null ");
                break;
            case 3:
                sb.append("and  returnDate is null and  expiryDate < date_add(CURRENT_DATE,interval 7 DAY) ");
                break;
        }
        if(keyWork!=null){
            sb.append(" and clientPhone like '%"+keyWork+"%' or clientName like '%"+keyWork+"%'");
        }
        List<Map<String,Object>> data = runner.query(conn,sb.toString(),new MapListHandler());
        DBHelper.close(conn);
        return data;
    }
//
//    public static void main(String[] args) {
//        try {
//            List<Map<String,Object>> records = new BorrowDao().query(0,null);
//            for(Map<String,Object> row:records){
//                for(String key:row.keySet()){
//                    System.out.print(key+":"+row.get(key)+"\t");
//                }
//                System.out.println();
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
}
