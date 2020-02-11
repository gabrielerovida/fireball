package it.gr.fireball.actions;

import org.hibernate.Session;

import com.opensymphony.xwork2.ActionSupport;

import it.gr.fireball.interfaces.MyActionSupport;
import it.gr.fireball.support.SessionSupport;
import it.gr.fireball.utils.HibernateUtil;


public class Welcome extends ActionSupport implements MyActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2691398859817071457L;
	
	private Long countLeads;
	private Long countRequests;
	
	public String execute() {
		
		try {
			
			if(SessionSupport.checkSession()) {
				
				Session session = HibernateUtil.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				this.countLeads = (Long) session.createQuery("SELECT COUNT(*) FROM Lead").uniqueResult();
				this.countRequests = (Long) session.createQuery("SELECT COUNT(*) FROM Request").uniqueResult();
				session.getTransaction().commit();
				
				return SUCCESS;
			} else {
				return SUCCESS_NOLOGIN;
			}
			
		} catch(Exception ex) {
			ex.printStackTrace();
			return ERROR;
		}
		
	}

	public Long getCountLeads() {
		return countLeads;
	}

	public void setCountLeads(Long countLeads) {
		this.countLeads = countLeads;
	}

	public Long getCountRequests() {
		return countRequests;
	}

	public void setCountRequests(Long countRequests) {
		this.countRequests = countRequests;
	}


	
}
