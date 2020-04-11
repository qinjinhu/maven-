package com.qjh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ysd.entity.Role;
import com.ysd.entity.User;


public interface UserMapper {
   
	public List<User> getUser(@Param("userName")String userName,@Param("beginDate") String beginDate,@Param("endDate") String endDate,@Param("isLock") String isLock,@Param("limit") int limit,@Param("page") int page);

	public int getCount(@Param("userName")String userName,@Param("beginDate") String beginDate,@Param("endDate") String endDate,@Param("isLock") String isLock);

	public int getAdd(@Param("id") String id,@Param("userName") String userName,@Param("passWord") String passWord,@Param("createDate") String createDate,@Param("isLock") String isLock);

	public int getUpdate(@Param("id") String id,@Param("name") String userName,@Param("passWord") String passWord,@Param("createTime") String createDate,@Param("isLock") String isLock);

	public int getDelete(@Param("id") String id);

	public int getLock(@Param("lock")String lock,@Param("id") String id);

	public int updatePass(@Param("id")String id);

	public List<Role> getRolesAll();

	public List<Role> getRolesById(@Param("id")String id);

	public int addRoles(@Param("userid")String userId,@Param("roleid") String roleId);

	public int delRoles(@Param("userid")String userId,@Param("roleid") String roleId);
}
