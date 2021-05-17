package com.grwt.vo;

import java.io.Serializable;

public class EmployeeVo implements Serializable {
	private int id;
	private String emplname;
	private String  address;
	private String companyName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmplname() {
		return emplname;
	}
	public void setEmplname(String emplname) {
		this.emplname = emplname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "EmployeeVo [id=" + id + ", emplname=" + emplname + ", address=" + address + ", companyName="
				+ companyName + "]";
	}
	public EmployeeVo() {
		super();
	}
	public EmployeeVo(int id, String emplname, String address, String companyName) {
		super();
		this.id = id;
		this.emplname = emplname;
		this.address = address;
		this.companyName = companyName;
	}
	

}
