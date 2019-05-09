package com.oracle.web.mapper;

import com.oracle.web.bean.Admin;
import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer uId);

    int insert(Admin record);

    Admin selectByPrimaryKey(Integer uId);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);
}