package com.qjh.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qjh.service.LoginService;
import com.qjh.service.UserService;
import com.ysd.entity.Modules;
import com.ysd.entity.User;

@RestController
public class LoginController {
     
	@Resource(name="loginServiceImpl")
	private LoginService loginService;
	
	@RequestMapping("/login")
	public Map<String,Object> listCategory(String LoginName,String PassWord) throws Exception {
		Map<String, Object> map=new HashMap<String, Object>();
		User userr=loginService.login(LoginName, PassWord);
		map.put("code", 0);
		map.put("msg","");
		map.put("count", 10);
		map.put("data", userr);
		 return map;
    }
	
	public List<Object> children(int parentId,List<Modules> modules){
		List<Object> list=new ArrayList<Object>();
		for(Modules mo:modules) {
			Map<String, Object> map=new HashMap<String, Object>();
			if(mo.getParentId()==parentId) {
				 map.put("id", mo.getId());
				 map.put("title",mo.getName());
				 map.put("herf", mo.getPath());
				 list.add(map);
			}
		}
		 return list;
	}
	@RequestMapping("/getModulebyUserId")
	public List<Object> selectAll(String userId){
		List<Object> list=new ArrayList<Object>();	
		List<Modules> modules=loginService.findModule(userId);
        for(Modules mo:modules) {
        	Map<String, Object> map=new HashMap<String, Object>();
        	if(mo.getParentId()==0) {
        		 map.put("id",mo.getId());
	   	   		 map.put("title", mo.getName());	
	   	   		 map.put("children", children(mo.getId(),modules));
	   	   		 list.add(map);
        	}	 
        }
		 return list;
	}
}
