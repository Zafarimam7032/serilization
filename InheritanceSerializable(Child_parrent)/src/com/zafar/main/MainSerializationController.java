package com.zafar.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.zafar.Vo.StudentVo;

public class MainSerializationController {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		StudentVo studentVo = new StudentVo(1, "Zafar imam", "new Delhi");
		studentVo.setCollegeName("mrce");
		studentVo.setName("aass");
		System.out.println(studentVo);
		 System.out.println(studentVo.getCollegeName());
		 System.out.println(studentVo.getName());
		FileOutputStream fileOutputStream = new FileOutputStream("inr.ser");
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(studentVo);
		}
		FileInputStream fileInputStream = new FileInputStream("inr.ser");
		try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			StudentVo studentVo2 = (StudentVo) objectInputStream.readObject();
			System.out.println(studentVo2);
			 System.out.println(studentVo2.getCollegeName());
			 System.out.println(studentVo2.getName());
			
			
		}

	}

}
