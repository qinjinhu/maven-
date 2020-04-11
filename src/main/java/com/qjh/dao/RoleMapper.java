package com.qjh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ysd.entity.Role;

public interface RoleMapper {

	public List<Role> getRole(@Param("page")int page,@Param("limit") int limit);

	public int addRole(@Param("id")String id,@Param("name") String name);

	public int getCount();

	public int deleteRole(@Param("id")String id);

	public int updateRole(@Param("id")String id,@Param("name") String name);

	public List<Role> getModulesAll();

	public int addModules(@Param("roleId")String roleId,@Param("modulesId")String modulesId);

	public List<Role> getModulesById(@Param("roleId")String roleId);

	public int delModules(@Param("roleId")String roleId,@Param("modulesId")String modulesId);
}
