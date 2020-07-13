package com.sample.school.vo;

import java.util.Date;

public class Professor {
	
	private int no;
	private String name;
	private String rank;
	private Department department;
	private Date regjsteredDate;
	
	public Professor() {
		
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Date getRegjsteredDate() {
		return regjsteredDate;
	}

	public void setRegjsteredDate(Date regjsteredDate) {
		this.regjsteredDate = regjsteredDate;
	}
	
}
