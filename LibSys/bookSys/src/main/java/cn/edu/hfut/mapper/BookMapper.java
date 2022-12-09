package cn.edu.hfut.mapper;

import cn.edu.hfut.model.Book;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Long bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Long bookId);

    Book selectByBookIsbn(String bookIsbn);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> selectAll();

}