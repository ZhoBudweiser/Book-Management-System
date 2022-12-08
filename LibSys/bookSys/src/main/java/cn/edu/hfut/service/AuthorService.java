package cn.edu.hfut.service;

import cn.edu.hfut.model.Author;
import cn.edu.hfut.model.Vip;

import java.util.List;

public interface AuthorService {

    List<Author> selectAll();

    Vip selectByPrimaryKey(Long vipId);

    void add(Vip vip);

    void updateByPrimaryKeySelective(Vip vip);

    void deleteByPrimaryKey(Long vipId);
}
