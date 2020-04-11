package com.qjh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ysd.entity.Modules;

public interface ModuleMapper {

	public List<Modules> getModule();

	public int deleteModule(@Param("id")int id);

	public int updateModule(@Param("id")int id,@Param("name") String name);

	public int addModule(@Param("id")int id,@Param("parentId") int parentId,@Param("name") String name,@Param("path") String path,@Param("weight") int weight);

}
