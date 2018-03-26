package com.SchoolApp.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer staffid;
	private String fname;
	private String mname;
	private String lname;
	private Date bdate; 
	private Integer phone;
	private String address;
	private String city;
	private	String state;
	private Integer pin ;
	private	String sex;
	
	Staff(){}

	public Staff(Integer staffid, String fname, String mname, String lname, Date bdate, Integer phone, String address,
			String city, String state, Integer pin, String sex) {
		this.staffid = staffid;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.bdate = bdate;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.sex = sex;
	}

	public Integer getStaffid() {
		return staffid;
	}

	public void setStaffid(Integer staffid) {
		this.staffid = staffid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
}
