package com.zafar.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.zafar.userinfo.UserInfo;

public class SerilizationOperation {

	public boolean serilizationoperation() {
		boolean check= false;
		
		try {
			UserInfo userInfo = new UserInfo("Zafar imam",22, "123423");
			FileOutputStream fileoutputStream=new FileOutputStream("UserInfo.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileoutputStream);
			objectOutputStream.writeObject(userInfo);
			FileInputStream fileInputStream=new FileInputStream("UserInfo.ser");
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			UserInfo userInfo2= (UserInfo) objectInputStream.readObject();
			System.out.println(userInfo2);
			check=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return check;
	}

}
