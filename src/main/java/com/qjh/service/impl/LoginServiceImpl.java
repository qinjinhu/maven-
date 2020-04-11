package com.qjh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qjh.dao.LoginMapper;
import com.qjh.service.LoginService;
import com.ysd.entity.Modules;
import com.ysd.entity.User;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{
	
	@Resource(name="loginMapper")
	private LoginMapper loginMapper;
	
	public User login(String loginName, String passWord) {
		// TODO Auto-generated method stub
		return loginMapper.login(loginName,passWord);
	}

	public List<Modules> findModule(String userId) {
		// TODO Auto-generated method stub
		return loginMapper.findModule(userId);
	}
}