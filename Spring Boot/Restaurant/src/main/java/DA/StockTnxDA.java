package DA;

import java.sql.DriverManager;


import model.StockTnx;

public class StockTnxDA extends MysqlConnection{
	public void addStockTnx(StockTnx s) {
		String addStockTnxStatement = "insert into stock_tnx(productName,purchaseDate,amount,stockId,size) values(?,?,?,?,?)";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(addStockTnxStatement);
		
			
			
			
			
			
			
			ps.executeUpdate();

			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
