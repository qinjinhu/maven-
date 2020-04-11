package com.ysd.entity;

public class Role {

	private String Id;
	private String Name;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Role(String id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public Role() {
		super();
	}
	@Override
	public String toString() {
		return "Role [Id=" + Id + ", Name=" + Name + "]";
	}
	
}
