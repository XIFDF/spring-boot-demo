package com.xifdf.springbootdemo.mapper;

import com.xifdf.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserById(String userid);
}
