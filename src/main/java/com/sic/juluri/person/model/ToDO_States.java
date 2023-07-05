package com.sic.juluri.person.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ToDO_States")
public class ToDO_States {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String tasks;
	
	public ToDO_States() {
	}
	
	public ToDO_States(String name) {
		super();
		this.name = name;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String gettasks() {
		return tasks;
	}
	public void settasks(String tasks) {
		this.tasks = tasks;
	}
	
	
	
	

}
