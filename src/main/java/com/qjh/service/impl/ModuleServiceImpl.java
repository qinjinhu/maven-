package com.qjh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qjh.dao.ModuleMapper;
import com.qjh.service.ModuleService;
import com.ysd.entity.Modules;

@Service
@Transactional
public class ModuleServiceImpl implements ModuleService{
     
	@Resource(name="moduleMapper")
	private ModuleMapper moduleMapper;
	
	public List<Modules> findModule() {
		// TODO Auto-generated method stub
		return moduleMapper.getModule();
	}

	public int deleteModule(int id) {
		// TODO Auto-generated method stub
		return moduleMapper.deleteModule(id);
	}

	public int updateModule(int id, String name) {
		// TODO Auto-generated method stub
		return moduleMapper.updateModule(id,name);
	}

	public int addModule(int id, int parentId, String name, String path, int weight) {
		// TODO Auto-generated method stub
		return moduleMapper.addModule(id,parentId,name,path,weight);
	}

}
