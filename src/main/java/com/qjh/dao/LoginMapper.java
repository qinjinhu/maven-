package com.qjh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ysd.entity.Modules;
import com.ysd.entity.User;

public interface LoginMapper {

	User login(@Param("loginName")String loginName,@Param("passWord") String passWord);

	List<Modules> findModule(@Param("userId")String userId);
    
}
