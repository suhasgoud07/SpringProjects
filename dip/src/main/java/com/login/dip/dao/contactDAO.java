package com.login.dip.dao;

import com.login.dip.bean.contactUs;

public class contactDAO {
	private Integer U_id;
	private String Fname;
	private String EmailId;
	private String Message;
	
	public contactDAO()
	{
		this.U_id=101;
		this.Fname=Fname;
		this.EmailId=EmailId;
		this.Message=Message;
	}
	public contactDAO(contactUs cc)
	{
		this.U_id=101;	
		this.Fname=cc.getFname();
		this.EmailId=cc.getEmailId();
		this.Message=cc.getMessage();
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
