package cn.edu.hfut.mapper;

import cn.edu.hfut.model.Balance;
import cn.edu.hfut.model.BalanceKey;

public interface BalanceMapper {
    int deleteByPrimaryKey(BalanceKey key);

    int insert(Balance record);

    int insertSelective(Balance record);

    Balance selectByPrimaryKey(BalanceKey key);

    int updateByPrimaryKeySelective(Balance record);

    int updateByPrimaryKey(Balance record);
}