package com.zafar.main;

import java.io.IOException;

import com.zafar.creaditInfo.helper.CreaditcardDataInsert;

public class CreditCardExcutionController {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		CreaditcardDataInsert creaditcardDataInsert=new CreaditcardDataInsert();
		creaditcardDataInsert.serializeOperation();
	}
}
