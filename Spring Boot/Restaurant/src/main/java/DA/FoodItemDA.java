package DA;

import java.sql.DriverManager;
import java.util.*;

import model.FoodItem;

public class FoodItemDA extends MysqlConnection{

	public void addFood(FoodItem f) {
		String AddFoodStatement = "insert into food_item(foodName,foodPrice) values(?,?)";
		try {
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(AddFoodStatement);
			ps.setString(1, f.getFoodName());
			ps.setInt(2, f.getFoodPrice());
			
			ps.executeUpdate();

			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	
	List<FoodItem> getAllFoodById = new ArrayList<>();
	public List<FoodItem> getFoodById(int foodId){
		
		String getFoodByIdStatement = "select * from food_item where foodId = ?";
		 
		try {
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(getFoodByIdStatement);
			ps.setInt(1, foodId);
			
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				getAllFoodById.add(new FoodItem(rs.getInt(1),rs.getString(2),rs.getInt(3)));
			}

			
		}catch(Exception e){
			System.out.println(e);
		}
		
		return getAllFoodById;
	}
	
	
	List<FoodItem> getAllFood = new ArrayList<>();
	public List<FoodItem> getAllFood(){
		
		String getFoodStatement = "select * from food_item";
		 
		try {
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(getFoodStatement);
//			ps.setInt(1, foodId);
			
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				getAllFoodById.add(new FoodItem(rs.getInt(1),rs.getString(2),rs.getInt(3)));
			}

			
		}catch(Exception e){
			System.out.println(e);
		}
		
		return getAllFoodById;
	}
	
	
}
