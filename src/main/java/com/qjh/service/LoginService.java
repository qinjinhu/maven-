package com.qjh.service;

import java.util.List;

import com.ysd.entity.Modules;
import com.ysd.entity.User;

public interface LoginService {
    
	User login(String loginName, String passWord);

	List<Modules> findModule(String userId);
    
}
