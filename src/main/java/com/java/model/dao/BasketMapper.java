package com.java.model.dao;

import com.java.model.domain.Basket;

public interface BasketMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Basket record);

    int insertSelective(Basket record);

    Basket selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Basket record);

    int updateByPrimaryKey(Basket record);
}