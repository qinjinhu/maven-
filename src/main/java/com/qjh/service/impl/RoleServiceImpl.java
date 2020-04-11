package com.qjh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qjh.dao.RoleMapper;
import com.qjh.service.RoleService;
import com.ysd.entity.Role;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    
	@Resource(name="roleMapper")
	private RoleMapper roleMapper;
	
	public List<Role> findRole(int page,int limit) {
		// TODO Auto-generated method stub
		return roleMapper.getRole(page,limit);
	}

	public int addRole(String id, String name) {
		// TODO Auto-generated method stub
		return roleMapper.addRole(id,name);
	}

	public int findCount() {
		// TODO Auto-generated method stub
		return roleMapper.getCount();
	}

	public int deleteRole(String id) {
		// TODO Auto-generated method stub
		return roleMapper.deleteRole(id);
	}

	public int updateRole(String id, String name) {
		// TODO Auto-generated method stub
		return roleMapper.updateRole(id,name);
	}

	public List<Role> getModulesAll() {
		// TODO Auto-generated method stub
		return roleMapper.getModulesAll();
	}

	public List<Role> getModulesById(String roleId) {
		// TODO Auto-generated method stub
		return roleMapper.getModulesById(roleId);
	}

	public int addModules(String roleId, String modulesId) {
		// TODO Auto-generated method stub
		return roleMapper.addModules(roleId,modulesId);
	}

	public int delModules(String roleId, String modulesId) {
		// TODO Auto-generated method stub
		return roleMapper.delModules(roleId,modulesId);
	}
   
}
