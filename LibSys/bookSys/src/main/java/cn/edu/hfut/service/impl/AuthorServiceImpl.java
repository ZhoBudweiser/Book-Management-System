package cn.edu.hfut.service.impl;

import cn.edu.hfut.mapper.AuthorMapper;
import cn.edu.hfut.mapper.VipMapper;
import cn.edu.hfut.model.Author;
import cn.edu.hfut.model.Vip;
import cn.edu.hfut.service.AuthorService;
import cn.edu.hfut.service.VipService;
import cn.edu.hfut.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Author> selectAll() {
        SqlSession sqlSession = factory.openSession();

        AuthorMapper mapper = sqlSession.getMapper(AuthorMapper.class);

        List<Author> authors = mapper.selectAll();

        sqlSession.close();

        return authors;
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
