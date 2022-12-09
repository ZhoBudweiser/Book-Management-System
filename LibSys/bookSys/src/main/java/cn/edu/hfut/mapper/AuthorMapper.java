package cn.edu.hfut.mapper;

import cn.edu.hfut.model.Author;

import java.util.List;

public interface AuthorMapper {
    int deleteByPrimaryKey(Long authorId);

    int insert(Author record);

    int insertSelective(Author record);

    Author selectByPrimaryKey(Long authorId);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);

    List<Author> selectAll();
}