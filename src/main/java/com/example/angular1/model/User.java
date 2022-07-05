package com.example.angular1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_entity")
public class User {

	private long id;
	private String name;
	private String email;

	
	
	public User() {
		super();
	}

	public User(int i, String name, String email) {
		super();
		this.id = i;
		this.name = name;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name")
	@NotNull
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
