package it.gr.fireball.actions;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.opensymphony.xwork2.ActionSupport;

import it.gr.fireball.beans.Lead;
import it.gr.fireball.interfaces.MyActionSupport;
import it.gr.fireball.support.SessionSupport;
import it.gr.fireball.utils.HibernateUtil;

public class Leads extends ActionSupport implements MyActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5428612562373420731L;
	
	private List<Lead> leads = new ArrayList<Lead>(0);
	private Integer page = 1, pages = 1;
	private Integer begin, end;
	private List<Integer> paginator = new ArrayList<Integer>(0);
	
	@SuppressWarnings("unchecked")
	public String execute() {
		
		try {
			
			if(SessionSupport.checkSession()) {
			
				Session session = HibernateUtil.getSessionFactory().getCurrentSession();
				session.beginTransaction();
			
				String level[] = {"admin", "super"};
			
				if(SessionSupport.checkSessionLevel(level)) {
					this.leads = (List<Lead>)session.createQuery("FROM Lead").list();
				} else {
					Long id_admin = (Long)SessionSupport.getAdmin().getId_admin();
					this.leads = (List<Lead>)session.createQuery("FROM Lead WHERE id_admin = :id_admin").setParameter("id_admin", id_admin).list();
				}
			
				session.getTransaction().commit();
			
				Integer max = this.leads.size();
				System.out.println(this.leads.size());
			
				this.pages = (int) Math.ceil((double)max / 10);

				this.end = (getPage() * 10) - 1;
				this.begin = this.end - 9;
			
				if(this.end >= max) {
					this.end = max - 1;
				}
						
				return SUCCESS;
			} else {
				return SUCCESS_NOLOGIN;
			}
			
		} catch(Exception ex) {
			ex.printStackTrace();
			return ERROR;
		}
		
	}
	
	public List<Lead> getLeads() {
		return leads;
	}
	public void setLeads(List<Lead> leads) {
		this.leads = leads;
	}
	
	public Integer getBegin() {
		return begin;
	}

	public void setBegin(Integer begin) {
		this.begin = begin;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public List<Integer> getPaginator() {

		for(int i = 1; i <= this.pages; i++) {
			paginator.add(i);
		}
		
		return paginator;
		
	}

}
