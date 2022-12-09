package cn.edu.hfut.mapper;

import cn.edu.hfut.model.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Long adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Long adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}