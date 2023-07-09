package com.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_note")
public class Note {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	@Column(length=1500)
	private String content;
	private Date updateddate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}
	public Note(String title, String content, Date updateddate) {
		super();
		System.out.println("Parameterized constructor");
		
		this.title = title;
		this.content = content;
		this.updateddate = updateddate;
	}
	public Note() {
		super();
		System.out.println("Default constructor");
		// TODO Auto-generated constructor stub
	}
	
	
}
