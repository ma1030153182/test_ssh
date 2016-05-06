package com.tgb.entity;

import java.util.Date;

/**
 * Advice entity. @author MyEclipse Persistence Tools
 */

public class Advice implements java.io.Serializable {

	// Fields

	private Integer id;
	private College college;
	private String title;
	private String content;
	private Date shijian;

	// Constructors

	/** default constructor */
	public Advice() {
	}

	/** full constructor */
	public Advice(College college, String title, String content, Date shijian) {
		this.college = college;
		this.title = title;
		this.content = content;
		this.shijian = shijian;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getShijian() {
		return this.shijian;
	}

	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}

}