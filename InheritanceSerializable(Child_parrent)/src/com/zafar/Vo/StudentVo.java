package com.zafar.Vo;

import java.io.Serializable;

public class StudentVo extends TeacherVo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String studentName;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentVo [id=" + id + ", studentName=" + studentName + ", address=" + address + "]";
	}

	public StudentVo(int id, String studentName, String address) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.address = address;
	}

	public StudentVo() {
		super();
	}

}
