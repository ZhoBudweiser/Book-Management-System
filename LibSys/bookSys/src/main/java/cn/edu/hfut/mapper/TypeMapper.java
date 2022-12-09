package cn.edu.hfut.mapper;

import cn.edu.hfut.model.Type;

import java.util.List;

public interface TypeMapper {
    int deleteByPrimaryKey(Long typeId);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Long typeId);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    List<Type> selectAll();
}