package com.tnsif.polymorphism;

public class Calculator {
  private int numOne, numTwo, numThree;
  private float numFour, numFive;
  
  
  public int getNumOne() {
	return numOne;
}
  public void setNumOne(int numOne) {
	this.numOne = numOne;
  }
  public int getNumTwo() {
	return numTwo;
  }
  public void setNumTwo(int numTwo) {
	this.numTwo = numTwo;
  }
  public int getNumThree() {
	return numThree;
  }
  public void setNumThree(int numThree) {
	this.numThree = numThree;
  }
  public float getNumFour() {
	return numFour;
  }
  public void setNumFour(float numFour) {
	this.numFour = numFour;
  }
  public float getNumFive() {
	return numFive;
  }
  public void setNumFive(float numFive) {
	this.numFive = numFive;
  }
  
  
  @Override
public String toString() {
	return "Calculator [numOne=" + numOne + ", numTwo=" + numTwo + ", numThree=" + numThree + ", numFour=" + numFour
			+ ", numFive=" + numFive + "]";
}
  public Calculator() {
	  this.numOne=10;
	  this.numTwo=30;
	  this.numThree=40;
	  this.numFour=7.8f;
	  this.numFive=6.8f;
	
  }
  public Calculator(int numOne, int numTwo, int numThree) {
	this.numOne = numOne;
	this.numTwo = numTwo;
	  }
  public Calculator(int numThree, float numFour, float numFive) {
	this.numThree = numThree;
	this.numFour = numFour;
	this.numFive = numFive;
  }
  
public int   add (int a,int b, float c) {
	 int d=(int) (a+b+c);
	 return d;
 }
public int  add (int a, int b) {
	int x = a+b;
 return x;
}

 public int add (int a, float b) {
  int c=(int) (a+b);
  return c;
 }
}
