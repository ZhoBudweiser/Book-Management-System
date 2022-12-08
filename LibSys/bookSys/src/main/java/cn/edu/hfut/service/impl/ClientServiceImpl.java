package cn.edu.hfut.service.impl;

import cn.edu.hfut.mapper.ClientMapper;
import cn.edu.hfut.mapper.ViewMapper;
import cn.edu.hfut.mapper.VipMapper;
import cn.edu.hfut.model.Client;
import cn.edu.hfut.model.VBorrowClient;
import cn.edu.hfut.model.Vip;
import cn.edu.hfut.service.ClientService;
import cn.edu.hfut.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class ClientServiceImpl implements ClientService {

    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Client> selectAll() {
        SqlSession sqlSession = factory.openSession();

        ClientMapper clientMapper = sqlSession.getMapper(ClientMapper.class);

        List<Client> clients = clientMapper.selectAll();

        VipMapper vipMapper = sqlSession.getMapper(VipMapper.class);

        for (Client client : clients) {
            client.setVipType(vipMapper.selectByPrimaryKey(client.getVipId()));
        }

        sqlSession.close();

        return clients;
    }

    @Override
    public void add(Client client) {
        SqlSession sqlSession = factory.openSession();

        ClientMapper mapper = sqlSession.getMapper(ClientMapper.class);

        mapper.insert(client);
        sqlSession.commit();

        sqlSession.close();
    }

    @Override
    public Client selectByPrimaryKey(Long clientId) {
        SqlSession sqlSession = factory.openSession();

        ClientMapper mapper = sqlSession.getMapper(ClientMapper.class);

        Client client = mapper.selectByPrimaryKey(clientId);

        sqlSession.close();

        return client;
    }

    @Override
    public VBorrowClient selectByPhone(String clientPhone) {
        SqlSession sqlSession = factory.openSession();

        ViewMapper mapper = sqlSession.getMapper(ViewMapper.class);

        VBorrowClient vBorrowClient = mapper.selectByClientPhone(clientPhone);

        sqlSession.close();

        return vBorrowClient;
    }

    @Override
    public void updateByPrimaryKeySelective(Client client) {
        SqlSession sqlSession = factory.openSession();

        ClientMapper mapper = sqlSession.getMapper(ClientMapper.class);

        mapper.updateByPrimaryKeySelective(client);

        sqlSession.commit();

        sqlSession.close();
    }

    @Override
    public void logoutByPrimaryKey(Long clientId) {
        SqlSession sqlSession = factory.openSession();

        ClientMapper mapper = sqlSession.getMapper(ClientMapper.class);

        mapper.updateLogoutByPrimaryKey(clientId);

        sqlSession.commit();

        sqlSession.close();
    }

    @Override
    public void activateByPrimaryKey(Long clientId) {
        SqlSession sqlSession = factory.openSession();

        ClientMapper mapper = sqlSession.getMapper(ClientMapper.class);

        mapper.updateActivateByPrimaryKey(clientId);

        sqlSession.commit();

        sqlSession.close();
    }
}
