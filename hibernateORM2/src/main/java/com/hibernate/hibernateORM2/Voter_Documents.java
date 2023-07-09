package com.hibernate.hibernateORM2;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;


@Embeddable
public class Voter_Documents {

	private String AadharNo;
	private String Passport;
	private String tenthmarksheet;
	public String getAadharNo() {
		return AadharNo;
	}
	public void setAadharNo(String aadharNo) {
		AadharNo = aadharNo;
	}
	public String getPassport() {
		return Passport;
	}
	public void setPassport(String passport) {
		Passport = passport;
	}
	public String getTenthmarksheet() {
		return tenthmarksheet;
	}
	public void setTenthmarksheet(String tenthmarksheet) {
		this.tenthmarksheet = tenthmarksheet;
	}
	public Voter_Documents(String aadharNo, String passport, String tenthmarksheet) {
		super();
		AadharNo = aadharNo;
		Passport = passport;
		this.tenthmarksheet = tenthmarksheet;
	}
	public Voter_Documents() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Voter_Documents [AadharNo=" + AadharNo + ", Passport=" + Passport + ", tenthmarksheet=" + tenthmarksheet
				+ "]";
	}
	
	
}
