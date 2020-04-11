package com.qjh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ysd.entity.Role;
import com.ysd.entity.User;


public interface UserService {

	
  public List<User> findUser(String userName, String beginDate, String endDate, String isLock, int limit, int page1);
  
  public int  findCount(String userName, String beginDate, String endDate, String isLock);

  public int addUser(String id,String userName,String passWord,String creatDate,String isLock);

  public int updateUser(String id, String name, String passWord, String createTime, String isLock);

  public int deleteUser(String id);

  public int updateLock(String lock, String id);

  public int updatePass(String pass);

  public List<Role> getRolesAll();

  public List<Role> getRolesById(String id);

  public int addRoles(String userId, String roleId);

  public int delRoles(String userId, String roleId);
}
