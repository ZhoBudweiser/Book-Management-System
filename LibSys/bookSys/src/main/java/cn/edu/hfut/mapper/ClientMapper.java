package cn.edu.hfut.mapper;

import cn.edu.hfut.model.Client;

import java.util.List;

public interface ClientMapper {
    int deleteByPrimaryKey(Long clientId);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(Long clientId);

    Client selectByClientPhone(String clientPhone);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);

    List<Client> selectAll();

    int updateLogoutByPrimaryKey(Long clientId);

    int updateActivateByPrimaryKey(Long clientId);

}