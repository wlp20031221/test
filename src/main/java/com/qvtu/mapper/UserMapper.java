package com.qvtu.mapper;

import com.qvtu.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 作者
 * @create 2025-03-10-09:10
 * Mybatis整合的接口
 */
@Mapper
@Repository
public interface UserMapper {

    @Select("select * from users")
    public List<User> findAll();

}
