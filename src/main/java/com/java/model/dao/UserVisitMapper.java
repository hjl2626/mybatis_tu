package com.java.model.dao;

import com.java.model.domain.UserVisit;

public interface UserVisitMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserVisit record);

    int insertSelective(UserVisit record);

    UserVisit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserVisit record);

    int updateByPrimaryKey(UserVisit record);
}