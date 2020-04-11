package com.qjh.service;

import java.util.List;

import com.ysd.entity.Role;

public interface RoleService {
   
	public List<Role> findRole(int page1, int limit);

	public int addRole(String id, String name);

	public int findCount();

	public int deleteRole(String id);

	public int updateRole(String id, String name);

	public List<Role> getModulesAll();

	public List<Role> getModulesById(String roleId);

	public int addModules(String roleId, String modulesId);

	public int delModules(String roleId, String modulesId);
}
