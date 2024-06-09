package DA;

import java.sql.DriverManager;

import model.Payment;

public class PaymentDA extends MysqlConnection{
	public void addPayment(Payment p) {
		String addPaymentStatement = "insert into payment(date,billId,customerId,amount,paymentType) values(?,?,?,?,?)";
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement(addPaymentStatement);
			ps.setDate(1, p.getDate());
			ps.setInt(2, p.getBillId());
			ps.setInt(3, p.getCustomerId());
			ps.setInt(4, p.getAmount());
			ps.setString(5, p.getPaymentType());
			
			
			
			
			
			ps.executeUpdate();

			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
