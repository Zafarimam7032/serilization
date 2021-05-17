package com.zafar.creaditInfo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class CreaditCardInfo  implements Serializable{
	private long cardNumber;
	private String cardHolderName;
	private Date expireDate;
	private transient int cvv;
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "CreaditCardInfo [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", expireDate="
				+ expireDate + ", cvv=" + cvv + "]";
	}
	public CreaditCardInfo(long cardNumber, String cardHolderName, Date expireDate, int cvv) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.expireDate = expireDate;
		this.cvv = cvv;
	}
	public CreaditCardInfo() {
		super();
	}
	
	private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
		objectOutputStream.defaultWriteObject();
	    String cvvencrpt = "123"+ cvv;
	    objectOutputStream.writeObject(cvvencrpt);
		

	}
	private void readObject(ObjectInputStream inputStream) throws ClassNotFoundException, IOException {
	inputStream.defaultReadObject();
		String cvvdecrypt=(String) inputStream.readObject();
		String cvvnew=cvvdecrypt.substring(3);
		cvv=Integer.parseInt(cvvnew);
		

	}

}
