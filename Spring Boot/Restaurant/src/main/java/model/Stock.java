package model;

public class Stock {
	
	
	int stockId;
	String productName;
	int size;
	String sizeType;
	
	public Stock() {
		super();
	}

	public Stock(int stockId, String productName, int size, String sizeType) {
		super();
		this.stockId = stockId;
		this.productName = productName;
		this.size = size;
		this.sizeType = sizeType;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getSizeType() {
		return sizeType;
	}

	public void setSizeType(String sizeType) {
		this.sizeType = sizeType;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", productName=" + productName + ", size=" + size + ", sizeType="
				+ sizeType + ", getStockId()=" + getStockId() + ", getProductName()=" + getProductName()
				+ ", getSize()=" + getSize() + ", getSizeType()=" + getSizeType() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
