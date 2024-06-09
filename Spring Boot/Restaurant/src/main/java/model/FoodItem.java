package model;

public class FoodItem {

	int foodId;
	String foodName;
	int foodPrice;
	
	public FoodItem() {
		super();
	}

	public FoodItem(int foodId, String foodName, int foodPrice) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

	
	
	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	@Override
	public String toString() {
		return "FoodItem [foodId=" + foodId + ", foodName=" + foodName + ", foodPrice=" + foodPrice + ", getFoodId()="
				+ getFoodId() + ", getFoodName()=" + getFoodName() + ", getFoodPrice()=" + getFoodPrice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	
}
