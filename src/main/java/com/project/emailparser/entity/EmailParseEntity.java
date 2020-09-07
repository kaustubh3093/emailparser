package com.project.emailparser.entity;

public class EmailParseEntity {

	private String id;
	private String from;
	private String to;
	private String Subject;
	private String body;
	
	public EmailParseEntity() {
		
	}
	public EmailParseEntity(String from, String to, String subject, String body) {
		this.from = from;
		this.to = to;
		Subject = subject;
		this.body = body;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return Subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		Subject = subject;
	}
	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}
	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}
	
	@Override
	public String toString() {
		return "EmailParseEntity [id=" + id + ", from=" + from + ", to=" + to + ", Subject=" + Subject + ", body="
				+ body + "]";
	}
	
	
	
}
