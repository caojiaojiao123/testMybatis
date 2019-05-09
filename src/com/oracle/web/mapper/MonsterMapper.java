package com.oracle.web.mapper;

import com.oracle.web.bean.Monster;
import java.util.List;

public interface MonsterMapper {
    int deleteByPrimaryKey(Integer monsterId);

    int insert(Monster record);

    Monster selectByPrimaryKey(Integer monsterId);

    List<Monster> selectAll();

    int updateByPrimaryKey(Monster record);
}