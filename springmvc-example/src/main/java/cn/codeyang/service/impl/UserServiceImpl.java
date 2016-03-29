package cn.codeyang.service.impl;

import cn.codeyang.dao.UserDao;
import cn.codeyang.domain.User;
import cn.codeyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by meicai on 2016/3/28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public boolean saveUser(User user) {
        return false;
    }
}
