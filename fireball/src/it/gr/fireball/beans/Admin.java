package it.gr.fireball.beans;

import java.io.Serializable;
import java.util.Date;

public class Admin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9170334700164693487L;

	private Long id_admin;
	private String first_name;
	private String last_name;
	private String username;
	private String password;
	private Date create_date;
	private Date update_date;
	private Date last_activity_date;
	private String level;

	public Admin() {

	}

	public Long getId_admin() {
		return id_admin;
	}

	public void setId_admin(Long id_admin) {
		this.id_admin = id_admin;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public Date getLast_activity_date() {
		return last_activity_date;
	}

	public void setLast_activity_date(Date last_activity_date) {
		this.last_activity_date = last_activity_date;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}



}
