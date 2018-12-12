package com.xifdf.springbootdemo.mapper;

import com.xifdf.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("userMapper")
public interface UserMapper {

    User getUserById(String userid);
}
