package com.zafar.main;

import com.zafar.serilization.SerilizationOperation;

public class SerilizationController {
	public static void main(String[] args) {
		SerilizationOperation operation=new SerilizationOperation();
		boolean serilizationoperation = operation.serilizationoperation();
		if(serilizationoperation)
		{
		System.out.println("Successfully");
		}
		else
		{
		System.out.println("!Successfully ");
		}
		
		
	}

}
