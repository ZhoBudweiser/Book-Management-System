package cn.edu.hfut.service.impl;

import cn.edu.hfut.mapper.BookMapper;
import cn.edu.hfut.mapper.BorrowMapper;
import cn.edu.hfut.mapper.ViewMapper;
import cn.edu.hfut.model.Book;
import cn.edu.hfut.model.Borrow;
import cn.edu.hfut.model.VBorrowClient;
import cn.edu.hfut.model.VReturn;
import cn.edu.hfut.service.BookService;
import cn.edu.hfut.service.BorrowService;
import cn.edu.hfut.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.Date;
import java.util.List;

public class BorrowServiceImpl implements BorrowService {

    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public void insertByBookIds(Long clientId, List<Long> bookIds) {
        SqlSession sqlSession = factory.openSession();

        BorrowMapper mapper = sqlSession.getMapper(BorrowMapper.class);

        Borrow borrow = new Borrow();
        borrow.setClientId(clientId);
        borrow.setBorrowStatus("在借");
        borrow.setBorrowDate(new Date(System.currentTimeMillis()));
        borrow.setExpiryDate(new Date(System.currentTimeMillis() + (long)7 * 24 * 60 * 60 * 1000));
        borrow.setRenewNum((short)0);

        for (Long bookId : bookIds) {
            borrow.setBookId(bookId);
            mapper.insert(borrow);
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void insertByBookIdsAndDate(Long clientId, List<Long> bookIds, Date dueDate) {
        SqlSession sqlSession = factory.openSession();

        BorrowMapper mapper = sqlSession.getMapper(BorrowMapper.class);

        Borrow borrow = new Borrow();
        borrow.setClientId(clientId);
        borrow.setBorrowStatus("在借");
        borrow.setBorrowDate(new Date(System.currentTimeMillis()));
        borrow.setExpiryDate(dueDate);
        borrow.setRenewNum((short)0);

        for (Long bookId : bookIds) {
            borrow.setBookId(bookId);
            mapper.insert(borrow);
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<VReturn> selectBooksByClientPhone(String clientPhone) {
        SqlSession sqlSession = factory.openSession();

        ViewMapper mapper = sqlSession.getMapper(ViewMapper.class);

        List<VReturn> vReturns = mapper.selectBooksByClientPhone(clientPhone);

        sqlSession.close();

        return vReturns;
    }

    @Override
    public void updateByClientIdAndBookIds(Long clientId, List<Long> bookIds, List<Date> borrowDate, Date date) {
        SqlSession sqlSession = factory.openSession();

        BorrowMapper mapper = sqlSession.getMapper(BorrowMapper.class);

        Borrow borrow = new Borrow();
        borrow.setClientId(clientId);
        borrow.setBorrowStatus("归还");
        borrow.setReturnDate(date);

        for (int i = 0; i < bookIds.size(); i++) {
            borrow.setBookId(bookIds.get(i));
            borrow.setBorrowDate(borrowDate.get(i));
            mapper.updateByPrimaryKeySelective(borrow);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
