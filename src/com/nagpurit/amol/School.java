package com.nagpurit.amol;

public class School {
	private String name,address;
	private College clg;
	private HighSchool highSchool;

	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	
	public void setClg(College clg) {
		this.clg = clg;
	}

	public String getCollage() {
		return clg.cedu();
	}
	
	public void setHighSchool(HighSchool highSchool) {
		this.highSchool = highSchool;
	}
	
	public String getHighSchooName() {
		return this.highSchool.getHighSchoolName();
	}

	public String sedu() {
		return "Welcome to school";
	}

}
