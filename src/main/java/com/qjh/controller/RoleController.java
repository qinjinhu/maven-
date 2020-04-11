package com.qjh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qjh.service.RoleService;
import com.ysd.entity.Role;

@RestController
public class RoleController {

	
	  
		@Resource(name="roleServiceImpl")
		private RoleService roleService;

		
		@RequestMapping("/getRoles")
		public Map<String, Object> select(int page,int limit){
			Map<String, Object> map=new HashMap<String, Object>();
			int page1=(page-1)*limit;
			int count = roleService.findCount();
			List<Role> roles=roleService.findRole(page1,limit);
			 map.put("code", 0);
			 map.put("msg","");
			 map.put("count", count);
			 map.put("data", roles);
			 return map;
		}
		@RequestMapping("/addRole")
		public int addRole(String id,String name){
			
			int add=roleService.addRole(id,name);
			 
			 return add;
		}
		@RequestMapping("/deleteRole")
		public int deleteRole(String id){
			
			int delete=roleService.deleteRole(id);
			 
			 return delete;
		}
		@RequestMapping("/updateRole")
		public int updateRole(String id,String name){
			
			int update=roleService.updateRole(id,name);
			 
			 return update;
		}
		@RequestMapping("/getModulesAll")
		public Map<String, Object> getModulesAll(){
			Map<String, Object> map=new HashMap<String, Object>();
			
			List<Role> roles=roleService.getModulesAll();
			 map.put("code", 0);
			 map.put("msg","");
			 map.put("count", 10);
			 map.put("data", roles);
			 return map;
		}
	  @RequestMapping("/getModulesById")
		public List<Role> getModulesById(String RoleId){
			
			List<Role> roles=roleService.getModulesById(RoleId);
			 
			 return roles;
		}
	  @RequestMapping("/addModules")
		public int addModules(String RoleId,String ModulesId){
			
			
			int roles=roleService.addModules(RoleId,ModulesId);
			 
			 return roles;
		}
	
	  @RequestMapping("/delModules")
	  public int delRoles(String RoleId,String ModulesId){
	  
	  int roles=roleService.delModules(RoleId,ModulesId);
	  
	  return roles; 
	  }
}
