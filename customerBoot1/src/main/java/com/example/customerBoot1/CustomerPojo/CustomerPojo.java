package com.example.customerBoot1.CustomerPojo;

public class CustomerPojo {

	private int customerId;
	private String customerName;
	private String emailId;
	private String Address;

public CustomerPojo() {}
		
	
	
	public CustomerPojo(int customerId, String customerName, String emailId, String address) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.emailId = emailId;
		this.Address = address;
	}



public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

	

}
