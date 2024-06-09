package model;

public class OrderDes {
	int desId;
	int orderId;
	int foodId;
	
	public OrderDes() {
		super();
	}

	public OrderDes(int desId, int orderId, int foodId) {
		super();
		this.desId = desId;
		this.orderId = orderId;
		this.foodId = foodId;
	}

	
	public int getDesId() {
		return desId;
	}

	public void setDesId(int desId) {
		this.desId = desId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	
	@Override
	public String toString() {
		return "OrderDes [desId=" + desId + ", orderId=" + orderId + ", foodId=" + foodId + ", getDesId()=" + getDesId()
				+ ", getOrderId()=" + getOrderId() + ", getFoodId()=" + getFoodId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
