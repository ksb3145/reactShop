package com.myshop.react1.dao;

import java.util.List;
import com.myshop.react1.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("userDao")
public class UserDao {
    @Autowired private SqlSessionTemplate mybatis;

    public UserVO selectUserOne(UserVO pvo) {
        return mybatis.selectOne("com.myshop.react1.dao.UserDao.selectUserOne", pvo);
    }
}