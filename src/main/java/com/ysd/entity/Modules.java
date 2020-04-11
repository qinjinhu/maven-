package com.ysd.entity;

public class Modules {
     
	private Integer Id;
	private String Name;
	private Integer ParentId;
	private String Path;
	private Integer Weight;
	private String Ops;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getParentId() {
		return ParentId;
	}
	public void setParentId(Integer parentId) {
		ParentId = parentId;
	}
	public String getPath() {
		return Path;
	}
	public void setPath(String path) {
		Path = path;
	}
	public Integer getWeight() {
		return Weight;
	}
	public void setWeight(Integer weight) {
		Weight = weight;
	}
	public String getOps() {
		return Ops;
	}
	public void setOps(String ops) {
		Ops = ops;
	}
	public Modules(Integer id, String name, Integer parentId, String path, Integer weight, String ops) {
		super();
		Id = id;
		Name = name;
		ParentId = parentId;
		Path = path;
		Weight = weight;
		Ops = ops;
	}
	public Modules() {
		super();
	}
	@Override
	public String toString() {
		return "Modules [Id=" + Id + ", Name=" + Name + ", ParentId=" + ParentId + ", Path=" + Path + ", Weight="
				+ Weight + ", Ops=" + Ops + "]";
	}
	
}
