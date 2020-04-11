package com.qjh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qjh.dao.UserMapper;
import com.qjh.service.UserService;
import com.ysd.entity.Role;
import com.ysd.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Resource(name="userMapper")
	private UserMapper userMapper;


	public List<User> findUser(String userName, String beginDate, String endDate, String isLock, int limit, int page1) {
		// TODO Auto-generated method stub
		return userMapper.getUser(userName, beginDate, endDate, isLock, limit, page1);
	}

	public int findCount(String userName, String beginDate, String endDate, String isLock) {
		// TODO Auto-generated method stub
		return userMapper.getCount(userName, beginDate, endDate, isLock);
	}

	public int addUser(String id,String userName,String passWord,String creatDate,String isLock) {
		// TODO Auto-generated method stub
		return userMapper.getAdd(id, userName, passWord, creatDate,  isLock);
	}

	public int updateUser(String id, String name, String passWord, String createTime, String isLock) {
		// TODO Auto-generated method stub
		return userMapper.getUpdate(id, name, passWord, createTime,  isLock);
	}

	public int deleteUser(String id) {
		// TODO Auto-generated method stub
		return userMapper.getDelete(id);
	}

	public int updateLock(String lock,String id) {
		// TODO Auto-generated method stub
		return userMapper.getLock(lock,id);
	}

	public int updatePass(String id) {
		// TODO Auto-generated method stub
		return userMapper.updatePass(id);
	}

	public List<Role> getRolesAll() {
		// TODO Auto-generated method stub
		return userMapper.getRolesAll();
	}

	public List<Role> getRolesById(String id) {
		// TODO Auto-generated method stub
		return userMapper.getRolesById(id);
	}

	public int addRoles(String userId, String roleId) {
		// TODO Auto-generated method stub
		return userMapper.addRoles(userId,roleId);
	}

	public int delRoles(String userId, String roleId) {
		// TODO Auto-generated method stub
		return userMapper.delRoles(userId,roleId);
	}

}
