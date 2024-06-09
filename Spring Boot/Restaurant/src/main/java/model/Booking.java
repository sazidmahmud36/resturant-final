package model;

import java.sql.Date;

public class Booking {
	int bookingId;
	int tableNo;
	int customerId;
	String bookingTime;
	String bookingStatus;
	Date date;
	int orderId;
	
	
	public Booking() {
		super();
	}


	public Booking(int bookingId, int tableNo, int customerId, String bookingTime, String bookingStatus, Date date,
			int orderId) {
		super();
		this.bookingId = bookingId;
		this.tableNo = tableNo;
		this.customerId = customerId;
		this.bookingTime = bookingTime;
		this.bookingStatus = bookingStatus;
		this.date = date;
		this.orderId = orderId;
	}


	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public int getTableNo() {
		return tableNo;
	}


	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getBookingTime() {
		return bookingTime;
	}


	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}


	public String getBookingStatus() {
		return bookingStatus;
	}


	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", tableNo=" + tableNo + ", customerId=" + customerId
				+ ", bookingTime=" + bookingTime + ", bookingStatus=" + bookingStatus + ", date=" + date + ", orderId="
				+ orderId + ", getBookingId()=" + getBookingId() + ", getTableNo()=" + getTableNo()
				+ ", getCustomerId()=" + getCustomerId() + ", getBookingTime()=" + getBookingTime()
				+ ", getBookingStatus()=" + getBookingStatus() + ", getDate()=" + getDate() + ", getOrderId()="
				+ getOrderId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
