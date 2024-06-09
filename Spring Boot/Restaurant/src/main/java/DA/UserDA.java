package DA;

import java.sql.DriverManager;

import model.User;

public class UserDA extends MysqlConnection{
	
	public User register(User a) {
		
		String registerStatement = "insert into	user(admin_id, admin_name, admin_email, admin_pass) values(?,?,?,?)";
		try {
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(registerStatement);
			ps.setInt(1, a.getAdmin_id());
			ps.setString(2, a.getAdmin_name());
			ps.setString(3, a.getAdmin_email());
			ps.setString(4, a.getAdmin_pass());
			
			ps.executeUpdate();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return a;
	}
	
	
	
	
	public User login(int id, String password) {
		User e =null;
		try {
			
			String registerStatement = "select * from user where admin_id=? AND admin_pass=?";
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(registerStatement);
			ps.setInt(1, id);
			ps.setString(2, password);
			rs = ps.executeQuery();
			while(rs.next()) {
				e = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
			
			
//			PreparedStatement pst1 = con.prepareStatement("select * from employee where emp_id=? AND emp_password=?");
//			pst1.setInt(1, id);
//			pst1.setString(2, password);
//			ResultSet rs = pst1.executeQuery();
//			while (rs.next()) {
//				e=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
//			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}
		
}
