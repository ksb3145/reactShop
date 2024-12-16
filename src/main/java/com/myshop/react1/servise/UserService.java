package com.myshop.react1.servise;

import com.myshop.react1.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    UserVO selectUserOne(UserVO uvo);
}
