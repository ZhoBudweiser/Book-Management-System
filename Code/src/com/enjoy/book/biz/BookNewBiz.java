package com.enjoy.book.biz;

import com.enjoy.book.bean.Booknew;
import com.enjoy.book.dao.BookNewDao;
import com.enjoy.book.dao.RecordDao;

import java.sql.SQLException;
import java.util.List;

public class BookNewBiz {
    //BookDao的对象
    BookNewDao bookNewDao  = new BookNewDao();


    public List<Booknew> getBooksByTypeId(String bookIsbn)  {
        try {
            return bookNewDao.getBooksBybookIsbn(bookIsbn);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    public int add(String bookIsbn,String bookName,String bookPublish,double bookPrice,long bookTotalNum,
                   long bookNowNum,long bookReserveNum,String bookUnit,String bookAuthor,
                   String bookIntroduction,String bookType,String bookCategory)  {
        int count = 0;
        try {
            count =  bookNewDao.add(bookIsbn,bookName,bookPublish,bookPrice,bookTotalNum,bookNowNum,bookReserveNum,bookUnit,bookAuthor,bookIntroduction,bookType,bookCategory);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count;

    }

    /**
     * private String bookIsbn;
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
     * @param booknew
     * @return
     */

    public int add(Booknew booknew){
        return add(booknew.getBookIsbn(),booknew.getBookName(), booknew.getBookPublish(),booknew.getBookPrice(),
                booknew.getBookTotalNum(),booknew.getBookNowNum(), booknew.getBookReserveNum(),booknew.getBookUnit(),booknew.getBookAuthor(),
                booknew.getBookIntroduction(),booknew.getBookType(),booknew.getBookCategory());
    }

    public int modify(String bookIsbn,String bookName,String bookPublish,double bookPrice,long bookTotalNum,
                      long bookNowNum,long bookReserveNum,String bookUnit,String bookAuthor,
                      String bookIntroduction,String bookType,String bookCategory)  {
        int count = 0;
        try {
            count = bookNewDao.modify(bookIsbn,bookName,bookPublish,bookPrice,bookTotalNum,bookNowNum,bookReserveNum,bookUnit,bookAuthor,bookIntroduction,bookType,bookCategory);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count;
    }
    public int modify(Booknew booknew)  {
        int count = 0;
        try {
            count = bookNewDao.modify(booknew.getBookIsbn(),booknew.getBookName(), booknew.getBookPublish(),booknew.getBookPrice(),
                    booknew.getBookTotalNum(),booknew.getBookNowNum(), booknew.getBookReserveNum(),booknew.getBookUnit(),booknew.getBookAuthor(),
                    booknew.getBookIntroduction(),booknew.getBookType(),booknew.getBookCategory());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count;
    }

    /**
     * recordDao 先不管
     * @param bookIsbn
     * @return
     * @throws Exception
     */
    public int remove(String bookIsbn) throws Exception {
        RecordDao recordDao = new RecordDao();
        int count = 0;
        try {
            //1.判断id是否存在外键
//            List<Record> records = recordDao.getRecordByBookId(id);
//            if(records.size()>0){
//                throw new Exception("删除的书籍有子信息，删除失败");
//            }
            //2.删除
            count = bookNewDao.remove(bookIsbn);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count;

    }

    /**
     * 存在typebao 没有合理转换
     * @param pageIndex
     * @param pageSize
     * @return
     */
    public List<Booknew>  getByPage(int pageIndex,int pageSize) {
////        TypeDao typeDao = new TypeDao();
        List<Booknew> booknews = null;
        try {
            booknews = bookNewDao.getByPage(pageIndex,pageSize);
            //处理type对象的数据问题
            for(Booknew booknew:booknews){
//                String bookIsbn =  booknew.getBookIsbn();
                String booknewType = booknew.getBookType();
                booknew.getBookType();//null
                //根据typeid找到对应的type对象
//                Type type= typeDao.getById(typeId);
                //设置给book.setType()
//                book.setType(type);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return booknews;
//
    }


    public Booknew getById(String bookIsbn) {
        Booknew booknew = null;
//        TypeDao typeDao = new TypeDao();

        try {
            booknew = bookNewDao.getById(bookIsbn);
//            long typeId = book.getTypeId();
//            Type type =typeDao.getById(typeId);
//            book.setType(type);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
        return booknew;
    }
    /**
     * 由行数算页数
     * @return
     */
    public int  getPageCount(int pageSize) {
        int pageCount = 0;
        try {
            //1.获取行数
            int rowCount = bookNewDao.getCount();
            //2.根据行数得到页数,每页多少条
            pageCount =  (rowCount-1)/pageSize+1;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pageCount;
    }

    public Booknew getBybookName(String bookName)  {
        Booknew booknew = null;
        try {
            booknew = bookNewDao.getBybookName(bookName);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return booknew;
    }

}
