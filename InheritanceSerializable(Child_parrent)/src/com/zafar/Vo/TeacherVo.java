package com.zafar.Vo;


public class TeacherVo  {
	private int  id;
	private String name;
	private String collegeName;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "TeacherVo [id=" + id + ", name=" + name + ", collegeName=" + collegeName + ", address=" + address + "]";
	}
	public TeacherVo(int id, String name, String collegeName, String address) {
		super();
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
		this.address = address;
	}
	public TeacherVo() {
		super();
	}
	

}
