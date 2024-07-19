package com.collections;

import java.time.LocalDate;
import java.util.Date;

public class CreditCard {

	//DO NOT CHANGE THE NAMES OR DATA TYPES OR VISIBILITY OF THE BELOW MEMBER VARIABLES
	public long creditCardNum;
	public String customerName;
	public String customerEmail;
	public long customerPhone;
	public double billAmount;
	
	
	
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CreditCard(long creditCardNum, String customerName, String customerEmail, long customerPhone,
			Double billAmount) {
		super();
		this.creditCardNum = creditCardNum;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.billAmount = billAmount;
		
	}

	public long getCreditCardNum() {
		return creditCardNum;
	}
	public void setCreditCardNum(Long creditCardNum) {
		this.creditCardNum = creditCardNum;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(Long customerPhone) {
		this.customerPhone = customerPhone;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}
	

	@Override
	public String toString() {
		return "creditCardNum:" + creditCardNum + ", customerName:" + customerName + ", customerEmail="
				+ customerEmail + ", customerPhone:" + customerPhone + ", billAmount:" + billAmount ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp=1;
		temp = Double.doubleToLongBits(billAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (creditCardNum ^ (creditCardNum >>> 32));
		result = prime * result + ((customerEmail == null) ? 0 : customerEmail.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + (int) (customerPhone ^ (customerPhone >>> 32));
		
		return result;
	}
	
	public boolean equals(Object obj) {
		boolean result=true;
		
		CreditCard other = (CreditCard) obj;
		if (Double.doubleToLongBits(billAmount) != Double.doubleToLongBits(other.billAmount))
		{result=false;}
		if (creditCardNum != other.creditCardNum)
		{result=false;}
		if (customerEmail == null) {
			if (other.customerEmail != null)
			{result=false;}
		} else if (!customerEmail.equals(other.customerEmail))
		{result=false;}
		if (customerName == null) {
			if (other.customerName != null)
			{result=false;}
		} else if (!customerName.equals(other.customerName))
		{result=false;}
		if (customerPhone != other.customerPhone)
		{result=false;}
		
		
		return result;
	}

	public static void main(String args[])
	{
		CreditCard cd1=new CreditCard(100,"ann","ann@gmail.com",56777,2000.0);
		CreditCard cd2=new CreditCard(100,"ann34324","ann@gmail.com",56777,2000.0);
		if(cd1.equals(cd2))
		{
			System.out.println("both objects are same");
		}
		else
		{
			System.out.println("both objects are not same");
		}
	}
	

}
	
	
	
