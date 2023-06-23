package com.login.dip.bean;

import com.login.dip.dao.contactDAO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class contactUs {
	@Id
	private Integer U_id=101;
	private String Fname;
	private String EmailId;
	private String Message;
public contactUs()
{   this.U_id=U_id;
	this.Fname=Fname;
	this.EmailId=EmailId;
	this.Message=Message;
}
public contactUs(contactDAO cc)
{   
	this.Fname=cc.getFname();
	this.EmailId=cc.getEmailId();
	this.Message=cc.getMessage();
}
public Integer getU_id() {
	return U_id;
}
public void setU_id(Integer u_id) {
	U_id = u_id;
}
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public String getEmailId() {
	return EmailId;
}
public void setEmailId(String emailId) {
	EmailId = emailId;
}
public String getMessage() {
	return Message;
}
public void setMessage(String message) {
	Message = message;
}


}
