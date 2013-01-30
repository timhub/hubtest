package com.test.common;

import java.io.IOException;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

public class BaseBackingBean {
	
	private  static final String DEP_PAGE_URL = "applicantForm.jsf";
	private  static final String MAIN_PANEL_URL = "mainPanel.jsf";
	private  static final String EMAIL_PAGE_URL = "email/email.jsf";
	
	HttpServletResponse response;
	
	
	public void viewDepToolPage() throws IOException{
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().redirect(DEP_PAGE_URL);
		context.responseComplete();
	}
	
	public void viewMainPanelPage() throws IOException{
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().redirect(MAIN_PANEL_URL);
		context.responseComplete();
	}
	
	public void viewEmailPage() throws IOException{
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().redirect(EMAIL_PAGE_URL);
		context.responseComplete();
	}

}
