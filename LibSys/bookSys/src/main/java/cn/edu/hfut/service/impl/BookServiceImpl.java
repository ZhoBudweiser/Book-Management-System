package cn.edu.hfut.service.impl;

import cn.edu.hfut.mapper.*;
import cn.edu.hfut.model.Book;
import cn.edu.hfut.model.Client;
import cn.edu.hfut.model.VBorrowBook;
import cn.edu.hfut.model.Vip;
import cn.edu.hfut.service.BookService;
import cn.edu.hfut.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

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

    @Override
    public List<Book> selectAll() {
        SqlSession sqlSession = factory.openSession();

        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        List<Book> books = bookMapper.selectAll();

        TypeMapper typeMapper = sqlSession.getMapper(TypeMapper.class);
        AuthorMapper authorMapper = sqlSession.getMapper(AuthorMapper.class);
        PublisherMapper publisherMapper = sqlSession.getMapper(PublisherMapper.class);

        for (Book book : books) {
            book.setBookTypeType(typeMapper.selectByPrimaryKey(book.getBookTypeId()));
            book.setBookAuthorType(authorMapper.selectByPrimaryKey(book.getBookAuthorId()));
            book.setBookPublisherType(publisherMapper.selectByPrimaryKey(book.getPublisherId()));
        }

        sqlSession.close();

        return books;
    }

    @Override
    public void add(Book book) {
        SqlSession sqlSession = factory.openSession();

        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        mapper.insert(book);
        sqlSession.commit();

        sqlSession.close();
    }

    @Override
    public Book selectByPrimaryKey(Long bookId) {
        SqlSession sqlSession = factory.openSession();

        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        Book book = mapper.selectByPrimaryKey(bookId);

        sqlSession.close();

        return book;
    }

    @Override
    public void updateByPrimaryKeySelective(Book book) {
        SqlSession sqlSession = factory.openSession();

        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        mapper.updateByPrimaryKeySelective(book);

        sqlSession.commit();

        sqlSession.close();
    }
}
