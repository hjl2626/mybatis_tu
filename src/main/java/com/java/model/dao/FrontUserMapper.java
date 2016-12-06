package com.java.model.dao;

import com.java.model.domain.FrontUser;

public interface FrontUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FrontUser record);

    int insertSelective(FrontUser record);

    FrontUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FrontUser record);

    int updateByPrimaryKey(FrontUser record);
}