package DA;

import java.sql.DriverManager;
import java.util.*;

import model.TableInfo;

public class TableInfoDA extends MysqlConnection{
	
	public void createNewTable(TableInfo t) {
		String AddFoodStatement = "insert into table_info(tableNumber,tableSit,tablePosition,FpH) values(?,?,?,?)";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(AddFoodStatement);
			ps.setInt(1, t.getTableNumber());
			ps.setInt(2, t.getTableSit());
			ps.setString(3, t.getTablePosition());
			ps.setInt(4, t.getFph());
			
			
			ps.executeUpdate();

			ps.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	List<TableInfo> allTable = new ArrayList<>();
	public List<TableInfo> getAllTable() {
		String allTableStatement = "select * from table_info";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(allTableStatement);

		rs = ps.executeQuery();
		
		while(rs.next()) {
			allTable.add(new TableInfo(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7)));
		}

		ps.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return allTable;
	}
	
	List tableSit = new ArrayList();
	public List getAllTableSit() {
		String allTableSitStatement = "select DISTINCT tableSit from table_info";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(allTableSitStatement);

		rs = ps.executeQuery();
		
		while(rs.next()) {
			tableSit.add(rs.getInt(1));
		}

		ps.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return tableSit;
	}
	
//	Free Table Querry
	
//	List<TableInfo> freeTable= new ArrayList<>();
//	public List<TableInfo> getAllFreeTable(){
//		String allFreeTableStatement = "select * from table_info where tableNumber <> (select tableNo from booking where startTime between ? and ? or endTime between ? and ?)";
//		try {
//			
//			con = DriverManager.getConnection(url,user,pass);
//			ps = con.prepareStatement(allFreeTableStatement);
//
//		rs = ps.executeQuery();
//		
//		while(rs.next()) {
//			allTable.add(new TableInfo(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7)));
//		}
//
//			
//		}catch(Exception e){
//			System.out.println(e);
//		}
//		
//		
//		return freeTable;
//	}
	
	List<TableInfo> freeTable= new ArrayList<>();
	public List<TableInfo> getAllFreeTable(String time){
		String allFreeTableStatement = "select * from table_info where tableNumber <> (select tableNo from booking where bookingTime = ?)";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(allFreeTableStatement);

			ps.setString(1, time);
		rs = ps.executeQuery();
		
		while(rs.next()) {
			allTable.add(new TableInfo(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7)));
		}
		ps.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		return freeTable;
	}
	
	
	
	
	List<TableInfo> bookedTable = new ArrayList<>();
	public List<TableInfo> getAllBookedTable(){
		
		String allBookedTableStatement = "select * from table_info where status='Booked'";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(allBookedTableStatement);

		rs = ps.executeQuery();
		
		while(rs.next()) {
			bookedTable.add(new TableInfo(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7)));
		}

		ps.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		return bookedTable;
	}
	
	
	
	
	
	List<TableInfo> availableTable = new ArrayList<>();
	public List<TableInfo> getAllavailableTable(){
		
		String allAvailableTableStatement = "select * from table_info where status='available'";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(allAvailableTableStatement);

		rs = ps.executeQuery();
		
		while(rs.next()) {
			availableTable.add(new TableInfo(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7)));
		}

		ps.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return availableTable;
	}
	
	
	
	
	
	
	public void tableStatusUpdate(TableInfo t) {
		String updateTableStatement = "update table_info set status=? where tableNumber=?";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(updateTableStatement);
			ps.setString(1, t.getStatus());
			ps.setInt(2, t.getTableNumber());
			
			
			
			ps.executeUpdate();

			ps.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	
}
