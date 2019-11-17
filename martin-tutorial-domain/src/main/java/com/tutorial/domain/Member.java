package com.tutorial.domain;

import javax.persistence.*;
// https://namu.wiki/w/%EC%97%94%ED%8B%B0%ED%8B%B0
@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String name;

	@Column
	private String email;

	public Member() {

	}

	public Member(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
