package cn.edu.hfut.service.impl;

import cn.edu.hfut.mapper.ClientMapper;
import cn.edu.hfut.mapper.VipMapper;
import cn.edu.hfut.model.Client;
import cn.edu.hfut.model.Vip;
import cn.edu.hfut.service.ClientService;
import cn.edu.hfut.service.VipService;
import cn.edu.hfut.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class VipServiceImpl implements VipService {

    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Vip> selectAll() {
        SqlSession sqlSession = factory.openSession();

        VipMapper mapper = sqlSession.getMapper(VipMapper.class);

        List<Vip> vips = mapper.selectAll();

        sqlSession.close();

        return vips;
    }

    @Override
    public Vip selectByPrimaryKey(Long vipId) {
        SqlSession sqlSession = factory.openSession();

        VipMapper mapper = sqlSession.getMapper(VipMapper.class);

        Vip vip = mapper.selectByPrimaryKey(vipId);

        sqlSession.close();

        return vip;
    }

    @Override
    public void add(Vip vip) {
        SqlSession sqlSession = factory.openSession();

        VipMapper mapper = sqlSession.getMapper(VipMapper.class);

        mapper.insert(vip);
        sqlSession.commit();

        sqlSession.close();
    }

    @Override
    public void updateByPrimaryKeySelective(Vip vip) {
        SqlSession sqlSession = factory.openSession();

        VipMapper mapper = sqlSession.getMapper(VipMapper.class);

        mapper.updateByPrimaryKeySelective(vip);

        sqlSession.commit();

        sqlSession.close();
    }

    @Override
    public void deleteByPrimaryKey(Long vipId) {
        SqlSession sqlSession = factory.openSession();

        VipMapper mapper = sqlSession.getMapper(VipMapper.class);

        mapper.deleteByPrimaryKey(vipId);

        sqlSession.commit();

        sqlSession.close();
    }

}
