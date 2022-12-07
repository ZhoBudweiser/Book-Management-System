package cn.edu.hfut.service;

import cn.edu.hfut.model.Vip;

import java.util.List;

public interface VipService {

    List<Vip> selectAll();

    Vip selectByPrimaryKey(Long vipId);

    void add(Vip vip);

    void updateByPrimaryKeySelective(Vip vip);

    void deleteByPrimaryKey(Long vipId);
}
