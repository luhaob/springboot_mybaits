package com.demo.example.domain.mapper;

public interface BaseMapper<T, P> {
    int deleteByPrimaryKey(P id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(P id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
