package DA;

import java.sql.Date;
import java.sql.DriverManager;

import model.Bill;

public class BillDA extends MysqlConnection{
	Bill newbill= new Bill();
	public Bill addBill(Bill b) {
		String addBillStatement = "insert into bill(customerId,date,totalBill,paid,due,billStatus) values(?,?,?,?,?,?)";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(addBillStatement);
			ps.setInt(1, b.getCustomerId());
			ps.setDate(2, b.getDate());
			ps.setInt(3, b.getTotalBill());
			ps.setInt(4, b.getPaid());
			ps.setInt(5, b.getDue());
			ps.setString(6, b.getBillStatus());
			ps.executeUpdate();
			
			String getBillId="select * from bill where customerId=?";
			ps=con.prepareStatement(getBillId);
			ps.setInt(1, b.getCustomerId());
			rs=ps.executeQuery();
			while(rs.next()) {
				newbill=new Bill(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getString(7));
				
			}
			ps.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		return newbill;
	}
	
	
	Bill getBillIdByCustomerId= new Bill();
	public Bill getBillIdByCustomerId(int customerId, Date date) {
//		String addBillStatement = "insert into bill(customerId,date,totalBill,paid,due,billStatus) values(?,?,?,?,?,?)";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			String getBillId="select * from bill where customerId=? and date=?";
			ps=con.prepareStatement(getBillId);
			ps.setInt(1, customerId);
			ps.setDate(2, date);
			rs=ps.executeQuery();
			while(rs.next()) {
				getBillIdByCustomerId=new Bill(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getString(7));
				
			}
			
			ps.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return getBillIdByCustomerId;
	}
	
	public void billupdate(Bill b) {
try {
			
			con = DriverManager.getConnection(url,user,pass);
			String updateBill="update bill set totalBill=?, paid=?, due=?, billStatus=? where billId=?";
			ps=con.prepareStatement(updateBill);
			ps.setInt(1, b.getTotalBill());
			ps.setInt(2, b.getPaid());
			ps.setInt(3, b.getDue());
			ps.setString(4, b.getBillStatus());
			ps.setInt(5, b.getBillId());
			ps.executeUpdate();
			
			ps.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
