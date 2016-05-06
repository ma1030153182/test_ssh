package com.tgb.entity;

import java.util.Date;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer id;
	private Major major;
	private College college;
	private String stunumber;
	private String password;
	private String stuname;
	private String sfzh;
	private String sex;
	private String zzmm;
	private String jiguan;
	private String minzu;
	private Date rxnf;
	private String address;
	private Integer length;
	private Integer weight;
	private String marry;
	private String moneycard;
	private String zhiwu;
	private String email;
	private String phone;
	private Integer cetf;
	private Integer cets;
	private Integer computer;

	private Integer status;
	private Integer computertwo;
	private Integer computerthr;
	private Integer computerfou;
	// Constructors

	/** default constructor */
	public Student() {
	}

	

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Major getMajor() {
		return this.major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public College getCollege() {
		return this.college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public String getStunumber() {
		return this.stunumber;
	}

	public void setStunumber(String stunumber) {
		this.stunumber = stunumber;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStuname() {
		return this.stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getSfzh() {
		return this.sfzh;
	}

	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getZzmm() {
		return this.zzmm;
	}

	public void setZzmm(String zzmm) {
		this.zzmm = zzmm;
	}

	public String getJiguan() {
		return this.jiguan;
	}

	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}

	public String getMinzu() {
		return this.minzu;
	}

	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}

	public Date getRxnf() {
		return this.rxnf;
	}

	public void setRxnf(Date rxnf) {
		this.rxnf = rxnf;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getLength() {
		return this.length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getMarry() {
		return this.marry;
	}

	public void setMarry(String marry) {
		this.marry = marry;
	}

	public String getMoneycard() {
		return this.moneycard;
	}

	public void setMoneycard(String moneycard) {
		this.moneycard = moneycard;
	}

	public String getZhiwu() {
		return this.zhiwu;
	}

	public void setZhiwu(String zhiwu) {
		this.zhiwu = zhiwu;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getCetf() {
		return this.cetf;
	}

	public void setCetf(Integer cetf) {
		this.cetf = cetf;
	}

	public Integer getCets() {
		return this.cets;
	}

	public void setCets(Integer cets) {
		this.cets = cets;
	}



	public Integer getComputer() {
		return computer;
	}



	public void setComputer(Integer computer) {
		this.computer = computer;
	}



	public Integer getComputertwo() {
		return computertwo;
	}



	public void setComputertwo(Integer computertwo) {
		this.computertwo = computertwo;
	}



	public Integer getComputerthr() {
		return computerthr;
	}



	public void setComputerthr(Integer computerthr) {
		this.computerthr = computerthr;
	}



	public Integer getComputerfou() {
		return computerfou;
	}



	public void setComputerfou(Integer computerfou) {
		this.computerfou = computerfou;
	}



	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}



	public Student(Integer id, Major major, College college, String stunumber,
			String password, String stuname, String sfzh, String sex,
			String zzmm, String jiguan, String minzu, Date rxnf,
			String address, Integer length, Integer weight, String marry,
			String moneycard, String zhiwu, String email, String phone,
			Integer cetf, Integer cets, Integer computerone, Integer status,
			Integer computertwo, Integer computerthr, Integer computerfou) {
		super();
		this.id = id;
		this.major = major;
		this.college = college;
		this.stunumber = stunumber;
		this.password = password;
		this.stuname = stuname;
		this.sfzh = sfzh;
		this.sex = sex;
		this.zzmm = zzmm;
		this.jiguan = jiguan;
		this.minzu = minzu;
		this.rxnf = rxnf;
		this.address = address;
		this.length = length;
		this.weight = weight;
		this.marry = marry;
		this.moneycard = moneycard;
		this.zhiwu = zhiwu;
		this.email = email;
		this.phone = phone;
		this.cetf = cetf;
		this.cets = cets;
		this.computer = computer;
		this.status = status;
		this.computertwo = computertwo;
		this.computerthr = computerthr;
		this.computerfou = computerfou;
	}
	

}