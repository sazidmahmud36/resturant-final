package DA;

import java.sql.DriverManager;

import model.Stock;

public class StockDA extends MysqlConnection{
	public void addStock(Stock s) {
		String addStockStatement = "insert into stock(productName,size,sizeType) values(?,?,?)";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(addStockStatement);
		
			
			
			
			
			
			
			ps.executeUpdate();

			
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
