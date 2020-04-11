package com.qjh.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.qjh.service.UserService;
import com.ysd.entity.Role;
import com.ysd.entity.User;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    
	@Resource(name="userServiceImpl")
	private UserService userService;

	
	@RequestMapping("/getUsers")
	public Map<String, Object> select(String userName,String beginDate,String endDate,String isLock,int limit,int page){
		Map<String, Object> map=new HashMap<String, Object>();
		int page1=(page-1)*limit;
		int count = userService.findCount( userName, beginDate, endDate,isLock);
		List<User> users=userService.findUser(userName, beginDate, endDate, isLock, limit, page1);
		 map.put("code", 0);
		 map.put("msg","");
		 map.put("count", count);
		 map.put("data", users);
		 return map;
	}
	@PostMapping("/addUser")
	public int addUser(String id,String userName,String passWord,String creatDate,String isLock){
		
		int add=userService.addUser(id, userName,passWord , creatDate, isLock);
		
		 return add;
	}
	
	  @PostMapping("/updateUser") public int updateUser(String id,String
	  name,String passWord,String createTime,String isLock){
	  
	  int update=userService.updateUser(id, name,passWord , createTime, isLock);
	  
	  return update; }
	  
	  @PostMapping("/deleteUser")
	  public int deleteUser(String id){
			  int delete=userService.deleteUser(id);
			  return delete; 
			  }
	  @PostMapping("/lock")
	  public int updateLock(String lock,String id){
			  int lockout=userService.updateLock(lock,id);
			  return lockout; 
			  }
	  @PostMapping("/updatePass")
	  public int updatePass(String id){
			  int passWord=userService.updatePass(id);
			  return passWord; 
			  }
	  @RequestMapping("/getRolesAll")
		public Map<String, Object> getRolesAll(){
			Map<String, Object> map=new HashMap<String, Object>();
			
			List<Role> roles=userService.getRolesAll();
			 map.put("code", 0);
			 map.put("msg","");
			 map.put("count", 10);
			 map.put("data", roles);
			 return map;
		}
	  @RequestMapping("/getRolesById")
		public List<Role> getRolesById(String UserId){
			
			List<Role> roles=userService.getRolesById(UserId);
			 
			 return roles;
		}
	  @RequestMapping("/addRoles")
		public int addRoles(String UserId,String RoleId){
			
			
			int roles=userService.addRoles(UserId,RoleId);
			 
			 return roles;
		}
	
	  @RequestMapping("/delRoles")
	  public int delRoles(String UserId,String RoleId){
	  
	  int roles=userService.delRoles(UserId,RoleId);
	  
	  return roles; 
	  }
}
