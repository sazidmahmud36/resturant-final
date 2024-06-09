package DA;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import model.BillDes;

public class BillDesDA extends MysqlConnection{
	public void addTableBookingBillDesc(BillDes b) {
		String addBillDescStatement = "insert into bill_des(billId,tableNumber,orderQuantity,amount,totalprice) values(?,?,?,?,?)";
		System.out.println(b.getBillId());
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(addBillDescStatement);
			ps.setInt(1, b.getBillId());
			ps.setInt(2, b.getTableNumber());
			ps.setInt(3, 1);
			ps.setInt(4, b.getAmount());
			ps.setInt(5, b.getAmount());
			
			ps.executeUpdate();

			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void addFoodBillDesc(List<BillDes> bill) {
		String addBillDescStatement = "insert into bill_des(billId,tableNumber,foodId,orderQuantity,amount,totalprice) values(?,?,?,?,?,?)";
		
		try {
			con = DriverManager.getConnection(url,user,pass);
			for(int i=0;i<bill.size();i++) {
				System.out.println(bill.get(i));
				ps = con.prepareStatement(addBillDescStatement);
				ps.setInt(1, bill.get(i).getBillId());
				ps.setInt(2, bill.get(i).getTableNumber());
				ps.setInt(3, bill.get(i).getFoodId());
				ps.setInt(4, bill.get(i).getOrderQuantity());
				ps.setInt(5, bill.get(i).getAmount());
				ps.setInt(6, bill.get(i).getTotalprice());
				
				ps.executeUpdate();
			}
			
			

			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	List<BillDes> allBill=new ArrayList<>();
	public List<BillDes> getAllBill(int billId){
		String getAllBillStatement = "select * from bill_des where billId = ?";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(getAllBillStatement);
			
			ps.setInt(1, billId);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				allBill.add(new BillDes(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(6)));
				
			}

			
		}catch(Exception e){
			System.out.println(e);
		}
		
		return allBill;
	}

}
