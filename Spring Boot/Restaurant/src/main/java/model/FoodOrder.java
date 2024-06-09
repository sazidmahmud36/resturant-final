package model;

import java.sql.Date;

public class FoodOrder {
	
	int orderId;
	int tableNumber;
	int customerId;
	String processSchedule;
	Date date;
	String orderStatus;
	
	public FoodOrder() {
		super();
	}

	public FoodOrder(int orderId, int tableNumber, int customerId, String processSchedule, Date date,
			String orderStatus) {
		super();
		this.orderId = orderId;
		this.tableNumber = tableNumber;
		this.customerId = customerId;
		this.processSchedule = processSchedule;
		this.date = date;
		this.orderStatus = orderStatus;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getProcessSchedule() {
		return processSchedule;
	}

	public void setProcessSchedule(String processSchedule) {
		this.processSchedule = processSchedule;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	
	@Override
	public String toString() {
		return "FoodOrder [orderId=" + orderId + ", tableNumber=" + tableNumber + ", customerId=" + customerId
				+ ", processSchedule=" + processSchedule + ", date=" + date + ", orderStatus=" + orderStatus
				+ ", getOrderId()=" + getOrderId() + ", getTableNumber()=" + getTableNumber() + ", getCustomerId()="
				+ getCustomerId() + ", getProcessSchedule()=" + getProcessSchedule() + ", getDate()=" + getDate()
				+ ", getOrderStatus()=" + getOrderStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
