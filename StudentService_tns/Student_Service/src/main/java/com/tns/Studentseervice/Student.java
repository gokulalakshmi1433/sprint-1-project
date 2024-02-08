package com.tns.Studentseervice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	private Integer S_id;
	private String S_name;
	private String S_dept;
	private String S_skills;
	
	public Student() {
		super();
	}
	
	public Student(Integer s_id, String s_name, String s_dept, String s_skills) {
		super();
		S_id = s_id;
		S_name = s_name;
		S_dept = s_dept;
		S_skills = s_skills;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getS_id() {
		return S_id;
	}
	public void setS_id(Integer s_id) {
		S_id = s_id;
	}
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		S_name = s_name;
	}
	public String getS_dept() {
		return S_dept;
	}
	public void setS_dept(String s_dept) {
		S_dept = s_dept;
	}
	public String getS_skills() {
		return S_skills;
	}
	public void setS_skills(String s_skills) {
		S_skills = s_skills;
	}
	@Override
	public String toString()
	{
		return "Student[Student id:"+S_id+" Student name"+S_name+" Student dept"+S_dept+" Student skills"+S_skills+"]";
	}
}
