package cn.codeyang.dao.impl;

import cn.codeyang.dao.UserDao;
import cn.codeyang.domain.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    private String ns = "cn.codeyang.mapper.UserMapper.";

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public int insert(User user) {
        return this.getSqlSession().insert(ns + "isnert", user);
    }
}
