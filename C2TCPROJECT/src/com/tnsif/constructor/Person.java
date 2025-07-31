package com.tnsif.constructor;

public class Person {

	 private String personName;
	private String personCity;
	private int personID;
	
	
	public Person() {
		this.personName="Apoorva R S";
		this.personCity="Kengeri";
		this.personID=1;
	
		// TODO Auto-generated constructor stub
	}
	
	public Person(String personName, String personCity, int personID) {
		super();
		this.personName = personName;
		this.personCity = personCity;
		this.personID = personID;
	}

	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personCity=" + personCity + ", personID=" + personID + "]";
	}
	
}
