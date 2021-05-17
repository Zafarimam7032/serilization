package com.grwts.vo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;


public class StudentVo implements Externalizable{

	private static final long serialVersionUID = 1L;
private int id;
private String name;
private String city;
private String college;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public StudentVo(int id, String name, String city, String college) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.college = college;
}

@Override
public String toString() {
	return "StudentVo [id=" + id + ", name=" + name + ", city=" + city + ", college=" + college + "]";
}
public StudentVo() {
	super();
}
@Override
public void writeExternal(ObjectOutput out) throws IOException {
out.writeInt(id);
out.writeObject(name);
out.writeObject(city);

}
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
id=in.readInt();
name=(String)in.readObject();
city=(String)in.readObject();
}

}
