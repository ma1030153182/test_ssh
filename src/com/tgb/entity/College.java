package com.tgb.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * College entity. @author MyEclipse Persistence Tools
 */

public class College implements java.io.Serializable {

	// Fields

	private Integer id;
	private String number;
	private String password;
	private String name;
	private Set majors = new HashSet(0);
	private Set students = new HashSet(0);
	private Set advices = new HashSet(0);

	// Constructors

	/** default constructor */
	public College() {
	}

	/** minimal constructor */
	public College(String number, String password, String name) {
		this.number = number;
		this.password = password;
		this.name = name;
	}

	/** full constructor */
	public College(String number, String password, String name, Set majors,
			Set students, Set advices) {
		this.number = number;
		this.password = password;
		this.name = name;
		this.majors = majors;
		this.students = students;
		this.advices = advices;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getMajors() {
		return this.majors;
	}

	public void setMajors(Set majors) {
		this.majors = majors;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

	public Set getAdvices() {
		return this.advices;
	}

	public void setAdvices(Set advices) {
		this.advices = advices;
	}

}