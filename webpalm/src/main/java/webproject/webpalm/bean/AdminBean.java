package webproject.webpalm.bean;

import org.springframework.stereotype.Component;

@Component
public class AdminBean {
	String adminId;
	String password;
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
