package it.gr.fireball.support;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import it.gr.fireball.beans.Admin;


public class SessionSupport {
	
	private static HttpSession session = ServletActionContext.getRequest().getSession();
	
	public static Boolean checkSession() {
		
		try {
			if(session != null) {
				if(session.getAttribute("logged_on") != null) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} catch(Exception ex) {
			if(ContextSupport.isDebug()) {
				ex.printStackTrace();
			}
			return false;
		}

	}
	
	public static Boolean checkSessionLevel(String level[]) {
		if(checkSession()) {
			
			Boolean result = false;
			
			for(int i = 0; i < level.length; i++) {
				if(((Admin) session.getAttribute("admin")).getLevel() == level[i]) {
					result = true;
				}
			}
			
			return result;
		} else {
			return false;
		}
	}
	
	public static Admin getAdmin() {
		if(checkSession()) {
			return (Admin) session.getAttribute("admin");
		} else {
			return null;
		}
	}
	
	public static HttpSession getSession() {
		if(!checkSession()) {
			session = ServletActionContext.getRequest().getSession(true);
		}
		return session;
	}

}
