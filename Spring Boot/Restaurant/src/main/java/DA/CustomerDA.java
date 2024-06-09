package DA;

import java.sql.DriverManager;


import model.Customer;

public class CustomerDA extends MysqlConnection{
	
	Customer customer=new Customer();
	
	public Customer addCustomer(Customer c) {
		System.out.println(c.getCustomerPhone());
		String addCustomerStatement = "insert into customer(customerName,customerPhone) values(?,?)";
		String findCustomer ="select * from customer where customerPhone=?";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(findCustomer);
			ps.setString(1, c.getCustomerPhone());
			rs=ps.executeQuery();
//			System.out.println(rs.next());
			
//			System.out.println(rs.next());
			while(rs.next()) {
				customer = new Customer(rs.getInt(1),rs.getString(2),rs.getString(3));
				System.out.println(customer.getCustomerName());
			}
			ps = con.prepareStatement(findCustomer);
			ps.setString(1, c.getCustomerPhone());
			rs=ps.executeQuery();
			boolean check=rs.next();
			System.out.println(check);
//			if(check) {
//				ps = con.prepareStatement(findCustomer);
//				ps.setString(1, c.getCustomerPhone());
//				rs=ps.executeQuery();
//				System.out.println(rs.next());
//				while(rs.next()) {
//					customer = new Customer(rs.getInt(1),rs.getString(2),rs.getString(3));
//					System.out.println(customer);
//				}
//			}
			if(!check) {
				System.out.println("Customer add work");
				ps=con.prepareStatement(addCustomerStatement);
				ps.setString(1, c.getCustomerName());
				ps.setString(2, c.getCustomerPhone());
				ps.executeUpdate();
				
				ps = con.prepareStatement(findCustomer);
				ps.setString(1, c.getCustomerPhone());
				rs=ps.executeQuery();
				while(rs.next()) {
					customer = new Customer(rs.getInt(1),rs.getString(2),rs.getString(3));
				}
			}
			
//			ps.executeUpdate();
			ps.close();
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		return customer;
	}
	
	
	
//	public Customer findCustomer(Customer c) {
//		
//		
//		return customer;
//	}
}
