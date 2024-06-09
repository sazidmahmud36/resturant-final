package DA;

import java.sql.DriverManager;

import model.FoodOrder;

public class FoodOrderDA extends MysqlConnection{
	public void addFoodOrder(FoodOrder b) {
		String addFoodOrderStatement = "insert into food_order(tableNumber,customerId,processSchedule,date,orderStatus) values(?,?,?,?,?)";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(addFoodOrderStatement);
		
			
			
			
			
			
			
			ps.executeUpdate();

			
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
