package com.javawebtutor.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Inbox")
public class Inbox  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
    private Long id;
    private String Sender;
    private String Reciever;
    private String Msg;
    private String Dat;
    
    public Inbox() {
    }
    
	public Inbox(String sender, String reciever, String msg, String dat) {
		this.Sender = sender;
		this.Reciever = reciever;
		this.Msg = msg;
		this.Dat = dat;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getSender() {
		return Sender;
	}
	
	public void setSender(String sender) {
		this.Sender = sender;
	}
	
	public String getReciever() {
		return Reciever;
	}
	
	public void setReciever(String reciever) {
		this.Reciever = reciever;
	}
	
	public String getMsg() {
		return Msg;
	}
	
	public void setMsg(String msg) {
		this.Msg = msg;
	}
	
	public String getDat() {
		return Dat;
	}
	
	public void setDat(String dat) {
		this.Dat = dat;
	}
   
    
	
	

}
