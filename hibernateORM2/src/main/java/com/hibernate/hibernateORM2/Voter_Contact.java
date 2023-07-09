package com.hibernate.hibernateORM2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_voter_contact")
public class Voter_Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ContactId;
	private String MobileNo;
	private String Email;
	@ManyToOne(cascade = CascadeType.ALL)
	private Voter voter;
	
	
	public Voter getVoter() {
		return voter;
	}
	public void setVoter(Voter voter) {
		this.voter = voter;
	}
	public int getContactId() {
		return ContactId;
	}
	public void setContactId(int contactId) {
		ContactId = contactId;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Voter_Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Voter_Contact(int contactId, String mobileNo, String email, Voter voter) {
		super();
		ContactId = contactId;
		MobileNo = mobileNo;
		Email = email;
		this.voter = voter;
	}
	@Override
	public String toString() {
		return "Voter_Contact [ContactId=" + ContactId + ", MobileNo=" + MobileNo + ", Email=" + Email + "]";
	}
	
	
}
