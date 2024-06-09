package DA;

import java.sql.DriverManager;

import model.OrderDes;



public class OrderDesDA extends MysqlConnection{
	public void addOrderDesc(OrderDes o) {
		String addOrderDescStatement = "insert into order_des(orderId,foodId) values(?,?)";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(addOrderDescStatement);
		
			
			
			
			
			
			
			ps.executeUpdate();

			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
