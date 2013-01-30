package com.emailtest.service;


import com.test.common.BaseBackingBean;

public class MailPageBackingBean extends BaseBackingBean{
	//Receive data test part
	
	private EmailDataBean emailData = new EmailDataBean();
	EmailServiceBackingBean emailService;
	
	private boolean emailAdFlag;
	private boolean emailContentFlag;
	private boolean emailTitleFlag;
	
	@SuppressWarnings("unused")
	public void init(){
		try{
			Thread emailThread =  new Thread(new Runnable(){
				public void run() {
					// TODO Auto-generated method stub
					emailService = new EmailServiceBackingBean();
					emailAdFlag = true;
					emailContentFlag = true;
					emailTitleFlag = true;
				}
			});
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void send(){
		if(emailService.checkContent(emailData) && emailService.checkEmail(emailData)){
			emailService.sendEmail(emailData);
		}
	}
	
	public void clear(){
		this.emailData = null;
	}
	
	public boolean getEmailAdFlag() {
		emailAdFlag = emailService.checkContent(emailData);
		return emailAdFlag;
	}

	public void setEmailAdFlag(boolean emailAdFlag) {
		this.emailAdFlag = emailAdFlag;
	}

	public boolean getEmailContentFlag() {
		emailContentFlag = emailService.checkEmail(emailData);
		return emailContentFlag;
	}

	public void setEmailContentFlag(boolean emailContentFlag) {
		this.emailContentFlag = emailContentFlag;
	}

	public boolean isEmailTitleFlag() {
		emailTitleFlag = emailService.checkTitle(emailData);
		return emailTitleFlag;
	}

	public void setEmailTitleFlag(boolean emailTitleFlag) {
		this.emailTitleFlag = emailTitleFlag;
	}
	
	public EmailDataBean getEmailData() {
		return emailData;
	}

	public void setEmailData(EmailDataBean emailData) {
		this.emailData = emailData;
	}
	
}
