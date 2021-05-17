package com.grwts.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.grwts.vo.StudentVo;

public class ExternalLization {
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		StudentVo studentVo=new StudentVo(1, "Zafar Imam", "New Delhi", "Mrce");
		FileOutputStream fileOutputStream=new FileOutputStream("student.ser");
		try(ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream))
		{
		objectOutputStream.writeObject(studentVo);
		}
		FileInputStream fileInputStream=new FileInputStream("student.ser");
		try(ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream))
		{
		StudentVo studentVo2=(StudentVo)objectInputStream.readObject();
		System.out.println(studentVo2);
		}
	}
 
}
