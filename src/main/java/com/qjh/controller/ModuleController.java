package com.qjh.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qjh.service.ModuleService;
import com.qjh.service.RoleService;
import com.ysd.entity.Modules;
import com.ysd.entity.Role;

@RestController
public class ModuleController {
   
	@Resource(name="moduleServiceImpl")
	private ModuleService moduleService;

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
	@RequestMapping("/getAllModule")
	public List<Object> selectAll(){
		List<Object> list=new ArrayList<Object>();	
		List<Modules> modules=moduleService.findModule();
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

	  @RequestMapping("/addModule")
	  public int addModule(int id,int parentId,String name,String path,int weight){
	  
	  int add=moduleService.addModule(id,parentId,name,path,weight);
	  
	  return add; }
	 
	@RequestMapping("/deleteModule")
	public int deleteRole(int id){
		
		int delete=moduleService.deleteModule(id);
		 
		 return delete;
	}
	 @RequestMapping("/updateModule") 
	 public int updateRole(int id,String name){
	  
	  int update=moduleService.updateModule(id,name);
	  
	  return update;
	  }
	 
}
