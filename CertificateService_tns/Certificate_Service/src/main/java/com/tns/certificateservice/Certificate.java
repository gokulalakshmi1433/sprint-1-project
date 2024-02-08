package com.tns.certificateservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Certificate {
	private Integer C_id;
	private String C_name;
	private String C_clgname;
	
	public Certificate() {
		super();
	}
	
	public Certificate(Integer c_id, String c_name, String c_clgname) {
		super();
		C_id = c_id;
		C_name = c_name;
		C_clgname = c_clgname;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getC_id() {
		return C_id;
	}
	public void setC_id(Integer c_id) {
		C_id = c_id;
	}
	public String getC_name() {
		return C_name;
	}
	public void setC_name(String c_name) {
		C_name = c_name;
	}
	public String getC_clgname() {
		return C_clgname;
	}
	public void setC_clgname(String c_clgname) {
		C_clgname = c_clgname;
	}
	@Override
	public String toString()
	{
		return "Certificate(Certificate id:"+C_id+" Certificate name"+C_name+" Certificate clgname"+C_clgname+"]";
	}
}
