package cn.edu.hfut.mapper;

import cn.edu.hfut.model.Borrow;
import cn.edu.hfut.model.BorrowKey;

public interface BorrowMapper {
    int deleteByPrimaryKey(BorrowKey key);

    int insert(Borrow record);

    int insertSelective(Borrow record);

    Borrow selectByPrimaryKey(BorrowKey key);

    int updateByPrimaryKeySelective(Borrow record);

    int updateByPrimaryKey(Borrow record);
}