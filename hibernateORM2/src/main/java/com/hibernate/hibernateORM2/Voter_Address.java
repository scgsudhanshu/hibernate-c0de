package com.hibernate.hibernateORM2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_voter_address")
public class Voter_Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Address_id;
	private String HouseNo;
	private String StreetNo;
	private String City;
	private String country;
	public String getHouseNo() {
		return HouseNo;
	}
	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}
	public String getStreetNo() {
		return StreetNo;
	}
	public void setStreetNo(String streetNo) {
		StreetNo = streetNo;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Voter_Address(String houseNo, String streetNo, String city, String country) {
		super();
		HouseNo = houseNo;
		StreetNo = streetNo;
		City = city;
		this.country = country;
	}
	public Voter_Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Voter_Address [HouseNo=" + HouseNo + ", StreetNo=" + StreetNo + ", City=" + City + ", country="
				+ country + "]";
	}
	
	
}
