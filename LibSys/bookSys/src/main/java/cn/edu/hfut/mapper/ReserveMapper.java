package cn.edu.hfut.mapper;

import cn.edu.hfut.model.Reserve;
import cn.edu.hfut.model.ReserveKey;

public interface ReserveMapper {
    int deleteByPrimaryKey(ReserveKey key);

    int insert(Reserve record);

    int insertSelective(Reserve record);

    Reserve selectByPrimaryKey(ReserveKey key);

    int updateByPrimaryKeySelective(Reserve record);

    int updateByPrimaryKey(Reserve record);
}