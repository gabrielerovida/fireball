package it.gr.fireball.actions;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionSupport;

import it.gr.fireball.beans.Admin;
import it.gr.fireball.interfaces.MyActionSupport;
import it.gr.fireball.support.SessionSupport;
import it.gr.fireball.utils.HibernateUtil;

public class Login extends ActionSupport implements MyActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7776601155766536717L;
	
	private Admin admin;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	public String execute() {
		
		try {
			
	    	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        this.admin = (Admin) session.createQuery("FROM Admin WHERE username = :username AND password = :password")
	        		.setParameter("username", this.admin.getUsername())
	        		.setParameter("password", DigestUtils.sha256Hex(this.admin.getPassword()))
	        		.uniqueResult();
	        
			
			if(this.admin != null) {
				
				this.admin.setLast_activity_date(new Date());
				session.saveOrUpdate(this.admin);
				session.getTransaction().commit();
				
				SessionSupport.getSession().setAttribute("logged_on", true);
				SessionSupport.getSession().setAttribute("admin", this.admin);
				
				return SUCCESS;
			} else {
				session.getTransaction().commit();
				return AUTH_ERROR;
			}
			
		} catch(Exception ex) {
			ex.printStackTrace();
			return ERROR;
		}
		

	}

}
