package com.hee.test.vo;

public class StudentVO {
	private int idx;
	private String name;
	private String email;
	private int grade;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentVO [idx=" + idx + ", name=" + name + ", email=" + email + ", grade=" + grade + "]";
	}
	
	
}
