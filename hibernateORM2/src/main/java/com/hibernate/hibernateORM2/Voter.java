package com.hibernate.hibernateORM2;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="tbl_Voter")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)

public class Voter {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String middlename;
	private String lastname;
	@Column(name="Date_of_birth")
	@Temporal(TemporalType.DATE)
	private Date DOB;
	@Id
	private String voterid;
	private String passwd;
	private String email;
	private String state;
	private String statecode;
	@Transient
	private String phone;
	private String seatname;
	@Lob
	private byte[] image;
	private Voter_Documents docs;
	@OneToOne
	private Voter_Address addr;
	@OneToMany(cascade = CascadeType.ALL,mappedBy="voter" , fetch = FetchType.EAGER)
	private List<Voter_Contact> contact;
	

	public List<Voter_Contact> getContact() {
		return contact;
	}

	public void setContact(List<Voter_Contact> contact) {
		this.contact = contact;
	}

	public Voter_Address getAddr() {
		return addr;
	}

	public void setAddr(Voter_Address addr) {
		this.addr = addr;
	}



	
	public Voter(int id, String firstname, String middlename, String lastname, Date dOB, String voterid, String passwd,
			String email, String state, String statecode, String phone, String seatname, byte[] image,
			Voter_Documents docs, Voter_Address addr, List<Voter_Contact> contact) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		DOB = dOB;
		this.voterid = voterid;
		this.passwd = passwd;
		this.email = email;
		this.state = state;
		this.statecode = statecode;
		this.phone = phone;
		this.seatname = seatname;
		this.image = image;
		this.docs = docs;
		this.addr = addr;
		this.contact = contact;
	}

	public Voter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getVoterid() {
		return voterid;
	}

	public void setVoterid(String voterid) {
		this.voterid = voterid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSeatname() {
		return seatname;
	}

	public void setSeatname(String seatname) {
		this.seatname = seatname;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "Voter [id=" + id + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
				+ ", DOB=" + DOB + ", voterid=" + voterid + ", passwd=" + passwd + ", email=" + email + ", state="
				+ state + ", statecode=" + statecode + ", phone=" + phone + ", seatname=" + seatname + ",  docs=" + docs + ", addr=" + addr + ", contact=" + contact + "]";
	}

	public Voter_Documents getDocs() {
		return docs;
	}

	public void setDocs(Voter_Documents docs) {
		this.docs = docs;
	}

	
	
	
	
	
	
}
