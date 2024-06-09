package model;

import java.sql.Date;

public class Bill {
	int billId;	
	int customerId;
	Date date;
	int totalBill;
	int paid;
	int due;
	String billStatus;
	
	
	public Bill() {
		super();
	}


	public Bill(int billId, int customerId, Date date, int totalBill, int paid, int due, String billStatus) {
		super();
		this.billId = billId;
		this.customerId = customerId;
		this.date = date;
		this.totalBill = totalBill;
		this.paid = paid;
		this.due = due;
		this.billStatus = billStatus;
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


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getTotalBill() {
		return totalBill;
	}


	public void setTotalBill(int totalBill) {
		this.totalBill = totalBill;
	}


	public int getPaid() {
		return paid;
	}


	public void setPaid(int paid) {
		this.paid = paid;
	}


	public int getDue() {
		return due;
	}


	public void setDue(int due) {
		this.due = due;
	}


	public String getBillStatus() {
		return billStatus;
	}


	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}


	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", customerId=" + customerId + ", date=" + date + ", totalBill=" + totalBill
				+ ", paid=" + paid + ", due=" + due + ", billStatus=" + billStatus + ", getBillId()=" + getBillId()
				+ ", getCustomerId()=" + getCustomerId() + ", getDate()=" + getDate() + ", getTotalBill()="
				+ getTotalBill() + ", getPaid()=" + getPaid() + ", getDue()=" + getDue() + ", getBillStatus()="
				+ getBillStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
