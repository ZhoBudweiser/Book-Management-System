package cn.edu.hfut.service.impl;

import cn.edu.hfut.mapper.TypeMapper;
import cn.edu.hfut.mapper.VipMapper;
import cn.edu.hfut.model.Type;
import cn.edu.hfut.model.Vip;
import cn.edu.hfut.service.TypeService;
import cn.edu.hfut.service.VipService;
import cn.edu.hfut.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class TypeServiceImpl implements TypeService {

    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Type> selectAll() {
        SqlSession sqlSession = factory.openSession();

        TypeMapper mapper = sqlSession.getMapper(TypeMapper.class);

        List<Type> types = mapper.selectAll();

        sqlSession.close();

        return types;
    }
}
