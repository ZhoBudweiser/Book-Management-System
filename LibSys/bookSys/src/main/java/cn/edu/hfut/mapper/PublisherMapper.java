package cn.edu.hfut.mapper;

import cn.edu.hfut.model.Publisher;

import java.util.List;

public interface PublisherMapper {
    int deleteByPrimaryKey(Long publisherId);

    int insert(Publisher record);

    int insertSelective(Publisher record);

    Publisher selectByPrimaryKey(Long publisherId);

    int updateByPrimaryKeySelective(Publisher record);

    int updateByPrimaryKey(Publisher record);

    List<Publisher> selectAll();
}