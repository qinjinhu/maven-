package com.qjh.service;

import java.util.List;

import com.ysd.entity.Modules;

public interface ModuleService {

	public List<Modules> findModule();

	public int deleteModule(int id);

	public int updateModule(int id, String name);

	public int addModule(int id, int parentId, String name, String path, int weight);

}
