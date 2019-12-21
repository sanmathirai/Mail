package com.ustglobal.mailbackend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mailinfo")
public class MailInfo {
	
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private int From_id;
	@Column
	private int To_id;
	@Column
	private String Subject;
	@Column
	private String Message;
	@Column
	private String Status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFrom_id() {
		return From_id;
	}
	public void setFrom_id(int from_id) {
		From_id = from_id;
	}
	public int getTo_id() {
		return To_id;
	}
	public void setTo_id(int to_id) {
		To_id = to_id;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	

}
