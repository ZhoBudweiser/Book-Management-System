package com.enjoy.book.dao;

import com.enjoy.book.util.DBHelper;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class SellDao {
    QueryRunner runner = new QueryRunner();
//    public List<Record> getRecordByBookId(long bookId) throws SQLException {
//        Connection conn = DBHelper.getConnection();
//        String sql ="select * from record where bookId= ?";
//        List<Record> records = runner.query(conn,sql,new BeanListHandler<Record>(Record.class),bookId);
//        DBHelper.close(conn);
//        return records;
//    }
//    /**
//     * 根据用户的身份证号查询用户借阅信息
//     * @param idNum
//     * @return
//     */
//    public List<Record> getRecordsByIdNum(String idNum) throws SQLException {
//        Connection conn = DBHelper.getConnection();
//        String sql ="select * from record where memberId = (select id from member where idNumber = ?)";
//        List<Record> records = runner.query(conn,sql,new BeanListHandler<Record>(Record.class), idNum);
//        DBHelper.close(conn);
//        return records;
//    }
//
//    /**
//     * 根据用户的会员编号查询用户借阅信息
//     * @param memberId
//     * @return
//     */
//    public List<Record> getRecordsByMemberId(long memberId) throws SQLException {
//        Connection conn = DBHelper.getConnection();
//        String sql ="select * from record where memberId= ? and backDate is null";
//        List<Record> records = runner.query(conn,sql,new BeanListHandler<Record>(Record.class),memberId);
//        DBHelper.close(conn);
//        return records;
//    }

    /**
     * 添加借阅记录
     * @param memberId
     * @param bookId
     * @return
     * @throws SQLException
     */
    public int add(String memberId,String bookId) throws SQLException {
        String sql="call insertSell(?, ?);";
        Connection conn = DBHelper.getConnection();
        int count = runner.execute(conn,sql,memberId,bookId);
        DBHelper.close(conn);
        return count;
    }
//
//    /**
//     *
//     * @param deposit 押金: 过期归还，>0  准时归还:清零
//     * @param userId 管理员编号
//     * @param id 记录编号
//     * @return
//     */
//    public  int modify(double deposit,long userId,long id) throws SQLException {
//        String sql = "update  record set backDate = CURRENT_DATE,deposit = ?,userId = ? where id=?";
//        Connection conn = DBHelper.getConnection();
//        int count = runner.update(conn,sql,deposit,userId,id);
//        DBHelper.close(conn);
//        return count;
//    }
//
//    public  int modify(long id) throws SQLException {
//        String sql = "update  record set rentDate = CURRENT_DATE where id=?";
//        Connection conn = DBHelper.getConnection();
//        int count = runner.update(conn,sql,id);
//        DBHelper.close(conn);
//        return count;
//    }
//
//
//
//    public Record getById(long recordId) throws SQLException {
//        Connection conn = DBHelper.getConnection();
//        String sql ="select * from record where id=?";
//        Record record = runner.query(conn,sql,new BeanHandler<Record>(Record.class),recordId);
//        DBHelper.close(conn);
//        return record;
//    }
//
    /**
     * 全部:0
     *     已归还:1
     *    未归还 :2
     *    最近一周需归还:3
     * @param typeId
     * @param keyWork
     * @return
     * @throws SQLException
     */

    public  List<Map<String,Object>>  query(int typeId, String keyWork) throws SQLException {
        Connection conn = DBHelper.getConnection();
        StringBuilder sb = null;
        List<Map<String,Object>> data = null;
        switch (typeId) {
            case 0:
                sb = new StringBuilder("select * from v_c_b_sell where 1=1 ");
                if(keyWork!=null){
                    sb.append(" and clientPhone like '%"+keyWork+"%' or clientName like '%"+keyWork+"%'");
                }
                data =runner.query(conn,sb.toString(),new MapListHandler());
                break;
            case 1:
                sb = new StringBuilder("call getClientBNum(?);");
                data = runner.query(conn,sb.toString(),new MapListHandler(),keyWork);
                break;
            case 2:
                sb = new StringBuilder("call getClientSNum(?);");
                data = runner.query(conn,sb.toString(),new MapListHandler(),keyWork);
                break;
            case 3:
                sb = new StringBuilder("call getBookBNum(?,?);");
                String[] buf = keyWork.split("@");
                data = runner.query(conn,sb.toString(),new MapListHandler(), buf[0], buf[1]);
                break;
            case 4:
                sb = new StringBuilder("call getBookSNum(?,?);");
                String[] buf2 = keyWork.split("@");
                data = runner.query(conn,sb.toString(),new MapListHandler(), buf2[0], buf2[1]);
                break;
        }
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
