package cn.edu.hfut.mapper;

import cn.edu.hfut.model.Vip;

import java.util.List;

public interface VipMapper {
    int deleteByPrimaryKey(Long vipId);

    int insert(Vip record);

    int insertSelective(Vip record);

    Vip selectByPrimaryKey(Long vipId);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);

    List<Vip> selectAll();
}