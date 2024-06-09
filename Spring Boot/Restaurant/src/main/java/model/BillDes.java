package model;

public class BillDes {
	
	int desId;
	int billId;
	int	tableNumber;
	int foodId;
	int orderQuantity;
	int amount;
	int totalprice;
	
	public BillDes() {
		super();
	}

	public BillDes(int desId, int billId, int tableNumber, int foodId, int orderQuantity, int amount, int totalprice) {
		super();
		this.desId = desId;
		this.billId = billId;
		this.tableNumber = tableNumber;
		this.foodId = foodId;
		this.orderQuantity = orderQuantity;
		this.amount = amount;
		this.totalprice = totalprice;
	}

	public int getDesId() {
		return desId;
	}

	public void setDesId(int desId) {
		this.desId = desId;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	@Override
	public String toString() {
		return "BillDes [desId=" + desId + ", billId=" + billId + ", tableNumber=" + tableNumber + ", foodId=" + foodId
				+ ", orderQuantity=" + orderQuantity + ", amount=" + amount + ", totalprice=" + totalprice
				+ ", getDesId()=" + getDesId() + ", getBillId()=" + getBillId() + ", getTableNumber()="
				+ getTableNumber() + ", getFoodId()=" + getFoodId() + ", getOrderQuantity()=" + getOrderQuantity()
				+ ", getAmount()=" + getAmount() + ", getTotalprice()=" + getTotalprice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	

}
