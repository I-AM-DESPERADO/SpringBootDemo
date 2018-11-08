package com.springboot.repository;

import com.springboot.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * create by tz on 2018-08-14
 */
@Repository
public interface UserRepository {

    @Insert("insert into user values(#{id},#{name},#{age})")
    public int insertUser(User user);

}
