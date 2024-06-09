package model;

public class User {
	
	int admin_id;
	String admin_name;
	String admin_email;
	String admin_pass;
	
	public User() {
		super();
	}

	public User(int admin_id, String admin_name, String admin_email, String admin_pass) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.admin_email = admin_email;
		this.admin_pass = admin_pass;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdmin_email() {
		return admin_email;
	}

	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}

	public String getAdmin_pass() {
		return admin_pass;
	}

	public void setAdmin_pass(String admin_pass) {
		this.admin_pass = admin_pass;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_name=" + admin_name + ", admin_email=" + admin_email
				+ ", admin_pass=" + admin_pass + ", getAdmin_id()=" + getAdmin_id() + ", getAdmin_name()="
				+ getAdmin_name() + ", getAdmin_email()=" + getAdmin_email() + ", getAdmin_pass()=" + getAdmin_pass()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

}
