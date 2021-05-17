package com.grwt.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.grwt.vo.EmployeeVo;
import com.grwt.vo.StudentVo;
import com.grwt.vo.TeacherVo;

public class SerializationOperation {

	public boolean display() throws IOException, ClassNotFoundException {
		boolean check = true;
		try {
			StudentVo studentVo = new StudentVo(1, "Zafar imam", "312232", "New Delhi");
			EmployeeVo employeeVo = new EmployeeVo(1, "Ateef Eqbal", "new delhi", "GreatWits");
			TeacherVo teacherVo = new TeacherVo(1, "Jitendera", "GreatWits", "new Delhi");
			FileOutputStream fileOutputStream = new FileOutputStream("multipleobject.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(studentVo);
			objectOutputStream.writeObject(teacherVo);
			objectOutputStream.writeObject(employeeVo);
			FileInputStream fileInputStream = new FileInputStream("multipleobject.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			StudentVo studentVo1 = (StudentVo) objectInputStream.readObject();
			TeacherVo teacherVo1 = (TeacherVo) objectInputStream.readObject();
			EmployeeVo employeeVo1 = (EmployeeVo) objectInputStream.readObject();
			System.out.println(studentVo1);
			System.out.println(teacherVo1);
			System.out.println(employeeVo1);
			check = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return check;
	}

}
