package it.gr.fireball.actions;

import com.opensymphony.xwork2.ActionSupport;

import it.gr.fireball.interfaces.MyActionSupport;
import it.gr.fireball.support.SessionSupport;


public class Logout extends ActionSupport implements MyActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -387947745425661572L;
	
	public String execute() {
		
		try {
			
			SessionSupport.getSession().removeAttribute("logged_on");
			SessionSupport.getSession().removeAttribute("admin");
			
			return SUCCESS;
			
		} catch(Exception ex) {
			ex.printStackTrace();
			return ERROR;
		}

	}

}
