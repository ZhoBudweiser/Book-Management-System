package cn.edu.hfut.service;

import cn.edu.hfut.model.Publisher;
import cn.edu.hfut.model.Vip;

import java.util.List;

public interface PublisherService {

    List<Publisher> selectAll();

    Vip selectByPrimaryKey(Long vipId);

    void add(Vip vip);

    void updateByPrimaryKeySelective(Vip vip);

    void deleteByPrimaryKey(Long vipId);
}
