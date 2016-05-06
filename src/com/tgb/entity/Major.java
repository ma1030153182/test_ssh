package com.tgb.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Major entity. @author MyEclipse Persistence Tools
 */

public class Major implements java.io.Serializable {

	// Fields

	private Integer id;
	private College college;
	private String name;
	private Set students = new HashSet(0);

	// Constructors

	/** default constructor */
	public Major() {
	}

	/** minimal constructor */
	public Major(College college, String name) {
		this.college = college;
		this.name = name;
	}

	/** full constructor */
	public Major(College college, String name, Set students) {
		this.college = college;
		this.name = name;
		this.students = students;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public College getCollege() {
		return this.college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}