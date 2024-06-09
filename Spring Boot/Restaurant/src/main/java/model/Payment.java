package model;

import java.sql.Date;

public class Payment {

	
	int paymentId;
	Date date;
	int billId;
	int customerId;
	int amount;
	String paymentType;
	
	
	public Payment() {
		super();
	}

	

	public Payment(int paymentId, Date date, int billId, int customerId, int amount, String paymentType) {
		super();
		this.paymentId = paymentId;
		this.date = date;
		this.billId = billId;
		this.customerId = customerId;
		this.amount = amount;
		this.paymentType = paymentType;
	}



	public int getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getBillId() {
		return billId;
	}


	public void setBillId(int billId) {
		this.billId = billId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String getPaymentType() {
		return paymentType;
	}


	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}



	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", date=" + date + ", billId=" + billId + ", customerId="
				+ customerId + ", amount=" + amount + ", paymentType=" + paymentType + ", getPaymentId()="
				+ getPaymentId() + ", getDate()=" + getDate() + ", getBillId()=" + getBillId() + ", getCustomerId()="
				+ getCustomerId() + ", getAmount()=" + getAmount() + ", getPaymentType()=" + getPaymentType()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
}
