package com.zafar.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.zafar.Vo.StudentVo;

public class SerializationOperation {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		StudentVo studentVo=new StudentVo(1,"Zafar imam","new delhi");
		FileOutputStream fileOutputStream=new FileOutputStream("student.ser");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(studentVo);
		FileInputStream fileInputStream=new FileInputStream("student.ser");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		StudentVo studentVo2=(StudentVo)objectInputStream.readObject();
		System.out.println(studentVo2);
	}

}
