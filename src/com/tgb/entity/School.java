package com.tgb.entity;

import java.util.Date;

/**
 * School entity. @author MyEclipse Persistence Tools
 */

public class School implements java.io.Serializable {

	// Fields

	private Integer id;
	private String number;
	private String password;
	private Date starttime;
	private Date end;

	// Constructors

	/** default constructor */
	public School() {
	}

	/** minimal constructor */
	public School(String number, String password) {
		this.number = number;
		this.password = password;
	}

	/** full constructor */
	public School(String number, String password, Date starttime, Date end) {
		this.number = number;
		this.password = password;
		this.starttime = starttime;
		this.end = end;
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

	public Date getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEnd() {
		return this.end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

}