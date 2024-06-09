package model;

import java.sql.Date;

public class StockTnx {
	
	int sTnxId;
	String productName;
	Date purchaseDate;
	int amount;
	int stockId;
	int size;
	
	public StockTnx() {
		super();
	}

	public StockTnx(int sTnxId, String productName, Date purchaseDate, int amount, int stockId, int size) {
		super();
		this.sTnxId = sTnxId;
		this.productName = productName;
		this.purchaseDate = purchaseDate;
		this.amount = amount;
		this.stockId = stockId;
		this.size = size;
	}

	public int getsTnxId() {
		return sTnxId;
	}

	public void setsTnxId(int sTnxId) {
		this.sTnxId = sTnxId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "StockTnx [sTnxId=" + sTnxId + ", productName=" + productName + ", purchaseDate=" + purchaseDate
				+ ", amount=" + amount + ", stockId=" + stockId + ", size=" + size + ", getsTnxId()=" + getsTnxId()
				+ ", getProductName()=" + getProductName() + ", getPurchaseDate()=" + getPurchaseDate()
				+ ", getAmount()=" + getAmount() + ", getStockId()=" + getStockId() + ", getSize()=" + getSize()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
