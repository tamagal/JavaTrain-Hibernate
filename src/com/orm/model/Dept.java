package com.orm.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dept {
	
	@Id
	private Integer dno;
	@Column
	private String name;
	
	@OneToMany(mappedBy = "dept",cascade = CascadeType.ALL)

	private Set<Emp> employees;
	public Set<Emp> getEmployees() {
		return employees;
	}



	public void setEmployees(Set<Emp> employees) {
		this.employees = employees;
	}



	public Integer getDno() {
		return dno;
	}



	public void setDno(Integer dno) {
		this.dno = dno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

public Dept() {
		
	}
	

	
	public Dept(Integer dno, String name) {
		super();
		this.dno = dno;
		this.name = name;
	}

	
	
	

}
