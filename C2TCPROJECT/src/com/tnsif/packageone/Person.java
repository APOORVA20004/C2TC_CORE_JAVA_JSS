package com.tnsif.packageone;

public class Person {
	
	private  String Personname;
	private  String PersonCity;
	public String getPersonname() {
		return Personname;
	}
	public void setPersonname(String personname) {
		Personname = personname;
	}
	public String getPersonCity() {
		return PersonCity;
	}
	public void setPersonCity(String personCity) {
		PersonCity = personCity;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	private  int Age;
	@Override
	public String toString() {
		return "Person [Personname=" + Personname + ", PersonCity=" + PersonCity + ", Age=" + Age + "]";
	}
	public Person() {
		
		// TODO Auto-generated constructor stub
	}
	public Person(String personname, String personCity, int age) {
		super();
		Personname = personname;
		PersonCity = personCity;
		Age = age;
	}
	

}
