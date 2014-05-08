package training.jobapplication.bean.backing;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import training.jobapplication.bean.model.Applicant;
import training.jobapplication.bean.support.ProvinceSupport;

/**
* Author Tim Yang
*/
public class ApplicantForm {
	private Applicant applicant;
	private ProvinceSupport provinceSupport;
	private boolean resumeRendered = false;
	private String lastName;

	/**
	 * Receives an instance of the Applicant model bean via dependency injection
	 */
	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	
	public ProvinceSupport getProvinceSupport() {
		return provinceSupport;
	}

	public void setProvinceSupport(ProvinceSupport provinceSupport) {
		this.provinceSupport = provinceSupport;
	}

	public boolean isResumeRendered() {
		return resumeRendered;
	}

	public void setResumeRendered(boolean resumeRendered) {
		this.resumeRendered = resumeRendered;
	}
	
	public void toggleResume(ActionEvent actionEvent) {
		this.resumeRendered = !this.resumeRendered;
	}
	
	public void lastNameChange(ValueChangeEvent e){
		System.out.println("211111111111111");
//		this.lastName = "Tian";
	}

	public String submit() {
		if (this.applicant.getFirstName().equals("John")) {
			if (this.applicant.getLastName().equals("Doe")) {
				String msg = "John Doe already works for us";
				FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
				FacesContext facesContext = FacesContext.getCurrentInstance();
				String clientId = null; // this is a global message
				facesContext.addMessage(clientId, facesMessage);
				return "retry";
			}
			
			return "success";
		}
		else {
			return "failure";
		}
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
