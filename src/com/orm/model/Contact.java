package com.orm.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Contact {
	
	@Id
	private Integer eno;
    @Column
	private String doorno;
    @Column
	private String street;
	@Column
	private String mobile;
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Emp employee;
	

    public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getDoorno() {
		return doorno;
	}

	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Emp getEmployee() {
		return employee;
	}

	public void setEmployee(Emp employee) {
		this.employee = employee;
	}

	
	public Contact(Integer eno, String doorno, String street, String mobile) {
		super();
		this.eno = eno;
		this.doorno = doorno;
		this.street = street;
		this.mobile = mobile;
	}
	
	public Contact() {
	}
		
}

	
	
	

