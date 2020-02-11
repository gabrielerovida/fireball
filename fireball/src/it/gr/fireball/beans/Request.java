package it.gr.fireball.beans;

import java.io.Serializable;
import java.util.Date;

public class Request implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8004626984099853946L;
	private Long id_request;
	private Long id_article;
	private String article_name;
	private String note;
	private String form_name;
	private String question_1;
	private String answer_1;
	private String question_2;
	private String answer_2;
	private String question_3;
	private String answer_3;
	private String question_4;
	private String answer_4;
	private String question_5;
	private String answer_5;
	private Date create_date;
	private String supplier_emails;
	private String supplier_service;
	private String new_request;
	
	private Lead lead;
	
	public Request() {
		
	}

	public Long getId_request() {
		return id_request;
	}

	public void setId_request(Long id_request) {
		this.id_request = id_request;
	}

	public Long getId_article() {
		return id_article;
	}

	public void setId_article(Long id_article) {
		this.id_article = id_article;
	}

	public String getArticle_name() {
		return article_name;
	}

	public void setArticle_name(String article_name) {
		this.article_name = article_name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getForm_name() {
		return form_name;
	}

	public void setForm_name(String form_name) {
		this.form_name = form_name;
	}

	public String getQuestion_1() {
		return question_1;
	}

	public void setQuestion_1(String question_1) {
		this.question_1 = question_1;
	}

	public String getAnswer_1() {
		return answer_1;
	}

	public void setAnswer_1(String answer_1) {
		this.answer_1 = answer_1;
	}

	public String getQuestion_2() {
		return question_2;
	}

	public void setQuestion_2(String question_2) {
		this.question_2 = question_2;
	}

	public String getAnswer_2() {
		return answer_2;
	}

	public void setAnswer_2(String answer_2) {
		this.answer_2 = answer_2;
	}

	public String getQuestion_3() {
		return question_3;
	}

	public void setQuestion_3(String question_3) {
		this.question_3 = question_3;
	}

	public String getAnswer_3() {
		return answer_3;
	}

	public void setAnswer_3(String answer_3) {
		this.answer_3 = answer_3;
	}

	public String getQuestion_4() {
		return question_4;
	}

	public void setQuestion_4(String question_4) {
		this.question_4 = question_4;
	}

	public String getAnswer_4() {
		return answer_4;
	}

	public void setAnswer_4(String answer_4) {
		this.answer_4 = answer_4;
	}

	public String getQuestion_5() {
		return question_5;
	}

	public void setQuestion_5(String question_5) {
		this.question_5 = question_5;
	}

	public String getAnswer_5() {
		return answer_5;
	}

	public void setAnswer_5(String answer_5) {
		this.answer_5 = answer_5;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public String getSupplier_emails() {
		return supplier_emails;
	}

	public void setSupplier_emails(String supplier_emails) {
		this.supplier_emails = supplier_emails;
	}

	public String getSupplier_service() {
		return supplier_service;
	}

	public void setSupplier_service(String supplier_service) {
		this.supplier_service = supplier_service;
	}

	public String getNew_request() {
		return new_request;
	}

	public void setNew_request(String new_request) {
		this.new_request = new_request;
	}

	public Lead getLead() {
		return lead;
	}

	public void setLead(Lead lead) {
		this.lead = lead;
	}

}
