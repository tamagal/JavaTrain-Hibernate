package com.orm.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Emp {
	
	@Id
	private Integer eno;
	@Column
	private String name;
	@Column
	private String city;
	@Column
	private String desig;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dno")
	private Dept dept;
	
	@OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
	@JoinColumn(name = "dno")
	private Contact contact;
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Emp()
	{
		super();
	}
	
	public Emp(Integer eno, String name, String city, String desig) {
		super();
		this.eno = eno;
		this.name = name;
		this.city = city;
		this.desig = desig;
	}
	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	

}
