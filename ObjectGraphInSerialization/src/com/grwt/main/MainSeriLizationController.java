package com.grwt.main;

import java.io.IOException;

import com.grwt.serialization.SerializationOperation;

public class MainSeriLizationController {
public static void main(String[] args) throws ClassNotFoundException, IOException {
	SerializationOperation serializationOperation=new SerializationOperation();
	boolean display = serializationOperation.display();
	if(display)
	{
		System.out.println("SucessFully!!");
	}
	else
	{
		System.out.println("unsucessfull !!");
	}
}
}
