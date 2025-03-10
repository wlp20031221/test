package com.qvtu.mapper;

import com.qvtu.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 作者
 * @create 2025-03-10-09:43
 * Mybatis整合的接口(xml文件)
 */

@Mapper
public interface UserXmlMapper {
    public List<User> findAll();
}
