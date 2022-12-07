package cn.edu.hfut.service;

import cn.edu.hfut.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> selectAll();

    Client selectByPrimaryKey(Long clientId);

    void add(Client client);

    void updateByPrimaryKeySelective(Client client);

    void logoutByPrimaryKey(Long clientId);

    void activateByPrimaryKey(Long clientId);

}
