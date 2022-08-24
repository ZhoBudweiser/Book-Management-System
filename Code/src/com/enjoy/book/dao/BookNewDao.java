package com.enjoy.book.dao;

import com.enjoy.book.bean.Booknew;
import com.enjoy.book.util.DBHelper;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BookNewDao {
    QueryRunner runner = new QueryRunner();

    /**
     * 根据类型查询对应的书籍信息
     * @param bookIsbn
     * @return
     * @throws SQLException
     */
    public List<Booknew> getBooksBybookIsbn(String bookIsbn) throws SQLException {
        Connection conn = DBHelper.getConnection();
        String sql = "SELECT * FROM booknew where bookISBN = ?";
        List<Booknew> booknews = runner.query(conn,sql,new BeanListHandler<Booknew>(Booknew.class),bookIsbn);
        DBHelper.close(conn);
        return booknews;
    }

    /**
     * 添加书籍
     * @return
     *  private String bookIsbn;
     *   private String bookName;
     *   private String bookPublish;
     *   private double bookPrice;
     *   private long bookTotalNum;
     *   private long bookNowNum;
     *   private long bookReserveNum;
     *   private String bookUnit;
     *   private String bookAuthor;
     *   private String bookIntroduction;
     *   private String bookType;
     *   private String bookCategory;
     */

    public int add(String bookIsbn,String bookName,String bookPublish,double bookPrice,long bookTotalNum,
                   long bookNowNum,long bookReserveNum,String bookUnit,String bookAuthor,
                   String bookIntroduction,String bookType,String bookCategory) throws SQLException {
        Connection conn  = DBHelper.getConnection();
        String sql="insert into booknew(`bookIsbn`,`bookName`,`bookPublish`,bookPrice,bookTotalNum,bookNowNum,bookReserveNum,`bookUnit`,`bookAuthor`,`bookIntroduction`,`bookType`,`bookCategory`) " +
                "values(?,?,?,?,?,?,?,?,?,?,?,?)";
        int count = runner.update(conn,sql,bookIsbn,bookName,bookPublish,bookPrice,bookTotalNum,bookNowNum,bookReserveNum,bookUnit,bookAuthor,bookIntroduction,bookType,bookCategory);
        DBHelper.close(conn);
        return count;

    }

    /**
     * 修改书籍
     *  private String bookIsbn;
     *   private String bookName;
     *   private String bookPublish;
     *   private double bookPrice;
     *   private long bookTotalNum;
     *   private long bookNowNum;
     *   private long bookReserveNum;
     *   private String bookUnit;
     *   private String bookAuthor;
     *   private String bookIntroduction;
     *   private String bookType;
     *   private String bookCategory;
     * @return
     */
    public int modify(String bookIsbn,String bookName,String bookPublish,double bookPrice,long bookTotalNum,
                      long bookNowNum,long bookReserveNum,String bookUnit,String bookAuthor,
                      String bookIntroduction,String bookType,String bookCategory) throws SQLException {
        Connection conn  = DBHelper.getConnection();
        String sql="update booknew set `bookName`=?,`bookPublish`=?,bookPrice=?,bookTotalNum=?,bookNowNum=?,bookReserveNum=?,`bookUnit`=?,`bookAuthor`=?,`bookIntroduction`=?,`bookType`=?,`bookCategory`=? where `bookIsbn`=? ";
        int count = runner.update(conn,sql,bookName,bookPublish,bookPrice,bookTotalNum,bookNowNum,bookReserveNum,bookUnit,bookAuthor,bookIntroduction,bookType,bookCategory,bookIsbn);
        DBHelper.close(conn);
        return count;

    }

    /**
     * 修改书籍的总体数量
     * @param String bookIsbn
     * @param bookIsbn
     * @param amount  整数:+1  负数 -1
     * @return
     * @throws SQLException
     */
    public int modify(String bookIsbn, long amount) throws SQLException {
        Connection conn  = DBHelper.getConnection();
        String sql="update booknew set bookTotalNum= bookTotalNum + ? where bookISBN= ? ";
        int count = runner.update(conn,sql,amount,bookIsbn);
        DBHelper.close(conn);
        return count;

    }
    public int remove(String bookIsbn) throws SQLException {
        Connection conn  = DBHelper.getConnection();
        String sql="DELETE FROM booknew WHERE bookISBN = ?";
        int count = runner.update(conn,sql,bookIsbn);
        DBHelper.close(conn);
        return count;
    }

    /**
     *页面查询(暂时不考虑排序问题)
     * @param pageIndex 第几页,从1开始
     * @param pageSize 每页多少行
     * @return 当前页的信息
     * @throws SQLException
     */
    public List<Booknew>  getByPage(int pageIndex,int pageSize) throws SQLException {
        Connection conn  = DBHelper.getConnection();
        String sql = "select * from booknew limit ?,?";
        int offset = (pageIndex-1)*pageSize;
        List<Booknew> booknews = runner.query(conn,sql,new BeanListHandler<Booknew>(Booknew.class),offset,pageSize);
        DBHelper.close(conn);
        return  booknews;
    }

    /**
     *
     * @param bookIsbn
     * @return
     * @throws SQLException
     */
    public Booknew getById(String bookIsbn) throws SQLException {
        Connection conn  = DBHelper.getConnection();
        String sql="select * from booknew where bookIsbn=?";
        Booknew booknew = runner.query(conn,sql,new BeanHandler<Booknew>(Booknew.class),bookIsbn);
        DBHelper.close(conn);
        return booknew;
    }

    /**
     * 获取书籍数量
     * @return
     * @throws SQLException
     */
    public int  getCount() throws SQLException {
        Connection conn  = DBHelper.getConnection();
        String sql = "select count(bookISBN)from booknew";
        Number data = runner.query(conn,sql,new ScalarHandler<>());
        int count = data.intValue();
        DBHelper.close(conn);
        return count;
    }

    /**
     * 根据书籍名称查询书籍信息
     * @param bookName
     * @return
     * @throws SQLException
     */
    public Booknew getBybookName(String bookName) throws SQLException {
        Connection conn  = DBHelper.getConnection();
        String sql="select * from booknew where bookName=?";
        Booknew booknew= runner.query(conn,sql,new BeanHandler<Booknew>(Booknew.class),bookName);
        DBHelper.close(conn);
        return booknew;
    }


    public static void main(String[] args) {
        try {
//            List<Book> books = new BookDao().getBooksByTypeId(2);
//            System.out.println(books.size());//[]:books对象有的，但是没有数据
//            for(Book book : books){
//                System.out.println(book);
//            }
            BookNewDao bookNewDao = new BookNewDao();
            // int count = bookDao .getCount();
//            List<Book> books = bookDao.getByPage(1,3);
//            for(Book book :books){
//                System.out.println(book);
//            }
            bookNewDao.modify("9999",-1);

            //System.out.println(count);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
