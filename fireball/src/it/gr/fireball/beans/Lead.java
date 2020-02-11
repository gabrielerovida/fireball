package it.gr.fireball.beans;

import java.io.Serializable;
import java.util.Date;

public class Lead implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7515980807288092376L;
	private Long id_lead;
	private String first_name;
	private String last_name;
	private String email;
	private String phone;
	private String phone_2;
	private String business_name;
	private String vat_number;
	private String gender;
	private String address;
	private String country;
	private String city;
	private String zip_code;
	private String disclaimer_1;
	private String disclaimer_2;
	private String disclaimer_3;
	private Date create_date;
	private Long id_admin;
	
	public Lead() {
		
	}

	public Long getId_lead() {
		return id_lead;
	}

	public void setId_lead(Long id_lead) {
		this.id_lead = id_lead;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone_2() {
		return phone_2;
	}

	public void setPhone_2(String phone_2) {
		this.phone_2 = phone_2;
	}

	public String getBusiness_name() {
		return business_name;
	}

	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}

	public String getVat_number() {
		return vat_number;
	}

	public void setVat_number(String vat_number) {
		this.vat_number = vat_number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getDisclaimer_1() {
		return disclaimer_1;
	}

	public void setDisclaimer_1(String disclaimer_1) {
		this.disclaimer_1 = disclaimer_1;
	}

	public String getDisclaimer_2() {
		return disclaimer_2;
	}

	public void setDisclaimer_2(String disclaimer_2) {
		this.disclaimer_2 = disclaimer_2;
	}

	public String getDisclaimer_3() {
		return disclaimer_3;
	}

	public void setDisclaimer_3(String disclaimer_3) {
		this.disclaimer_3 = disclaimer_3;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Long getId_admin() {
		return id_admin;
	}

	public void setId_admin(Long id_admin) {
		this.id_admin = id_admin;
	}
	
}