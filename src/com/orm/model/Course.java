package com.orm.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	private Integer cno;
	@Column
	private String name;
	
	@ManyToMany(mappedBy = "courses" , cascade = CascadeType.ALL)
	private Set<Trainer> trainers;
	
	public Course() {
		
	}

	public Course(Integer cno, String name) {
		super();
		this.cno = cno;
		this.name = name;
	}

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Trainer> getTrainers() {
		return trainers;
	}

	public void setTrainers(Set<Trainer> trainers) {
		this.trainers = trainers;
	}

}
