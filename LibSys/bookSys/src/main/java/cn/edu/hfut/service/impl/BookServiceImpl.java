package cn.edu.hfut.service.impl;

import cn.edu.hfut.mapper.BookMapper;
import cn.edu.hfut.mapper.ClientMapper;
import cn.edu.hfut.mapper.ViewMapper;
import cn.edu.hfut.model.Book;
import cn.edu.hfut.model.Client;
import cn.edu.hfut.model.VBorrowBook;
import cn.edu.hfut.service.BookService;
import cn.edu.hfut.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class BookServiceImpl implements BookService {

    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public VBorrowBook selectByBookIsdn(String bookIsdn) {
        SqlSession sqlSession = factory.openSession();

        ViewMapper mapper = sqlSession.getMapper(ViewMapper.class);

        VBorrowBook book = mapper.selectByBookIsbn(bookIsdn);

        sqlSession.close();

        return book;
    }
}
