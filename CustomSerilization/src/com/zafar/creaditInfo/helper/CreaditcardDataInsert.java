package com.zafar.creaditInfo.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.zafar.creaditInfo.CreaditCardInfo;

public class CreaditcardDataInsert {
	private CreaditCardInfo cardInfo = null;

	public CreaditcardDataInsert() {

	}

	public void serializeOperation() throws IOException, ClassNotFoundException {

		cardInfo = new CreaditCardInfo(1223212231211L, "Zafar imam",
				new GregorianCalendar(2024, Calendar.DECEMBER, 05).getTime(), 221);
		System.out.println(cardInfo);
		FileOutputStream fileOutputStream = new FileOutputStream("credit.ser");
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(cardInfo);
		}
		FileInputStream fileInputStream = new FileInputStream("credit.ser");
		try (ObjectInputStream inputStream = new ObjectInputStream(fileInputStream)) {
			CreaditCardInfo cardInfo1 = (CreaditCardInfo) inputStream.readObject();
			System.out.println(cardInfo1);
		}

	}
	
	

}
