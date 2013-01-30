package com.emailtest.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailServiceBackingBean extends Email {
	SimpleEmail email = new SimpleEmail();
	
	private String emailServer = "smtp.126.com"; 
	private String userName = "yzgogo2009";  
	private String password = "yangz2009";  
	private String emailEncoding = "utf-8";
	private static final String TARGET_EMAIL = "yzgogo1989@outlook.com";
	
	private boolean sendingMark = true;

	@Override
	public Email setMsg(String arg0) throws EmailException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean checkEmail(EmailDataBean emailData){
		Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
		Matcher matcher = pattern.matcher(emailData.getUserEmail());
		
		if(matcher.matches()){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean checkContent(EmailDataBean emailData){
		if("".equals(emailData.getEmailContent())){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean checkTitle(EmailDataBean emailData){
		if("".equals(emailData.getEmailTitle())){
			return true;
		}else{
			return false;
		}
	}
	
	public void sendEmail(EmailDataBean emailData){
		try{   
		   email.setHostName(emailServer);    
		   email.setAuthentication(userName, password);  
		   email.setCharset(emailEncoding); 
		   email.addTo(TARGET_EMAIL); 
		   email.setFrom(emailData.getUserEmail());
		   email.setSubject(emailData.getEmailTitle()); 
		   email.setMsg(emailData.getEmailContent());
		   email.send();
		}catch(Exception e){
			e.printStackTrace();
			setSendingMark(false);
		}
	 }

	public boolean isSendingMark() {
		return sendingMark;
	}

	public void setSendingMark(boolean sendingMark) {
		this.sendingMark = sendingMark;
	}

}
