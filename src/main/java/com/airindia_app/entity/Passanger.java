package com.airindia_app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passanger")
public class Passanger {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
private String fname;
private String lname;
private String email;
private long mobileno;
private String dep_airport;
private String arr_airport;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
public String getDep_airport() {
	return dep_airport;
}
public void setDep_airport(String dep_airport) {
	this.dep_airport = dep_airport;
}
public String getArr_airport() {
	return arr_airport;
}
public void setArr_airport(String arr_airport) {
	this.arr_airport = arr_airport;
}

	
}
