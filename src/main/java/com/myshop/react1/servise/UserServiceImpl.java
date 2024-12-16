package com.myshop.react1.servise;

import com.myshop.react1.dao.UserDao;
import com.myshop.react1.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired private UserDao userDao;

    @Override
    public UserVO selectUserOne(UserVO uvo) {
        return userDao.selectUserOne(uvo);
    }
}
