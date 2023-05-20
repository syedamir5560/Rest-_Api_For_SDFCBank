package com.amir;

public class StudentSpring {
	private int stdid;
	private String stdname;
	private double fee;
	private int s1,s2,s3;
	

public StudentSpring()
{
	super();
	
}


public void setStdid(int stdid) {
	this.stdid = stdid;
}


public void setStdname(String stdname) {
	this.stdname = stdname;
}


public void setFee(double fee) {
	this.fee = fee;
}


public void setS1(int s1) {
	this.s1 = s1;
}


public void setS2(int s2) {
	this.s2 = s2;
}


public void setS3(int s3) {
	this.s3 = s3;
}


public int getStdid() {
	return stdid;
}


public String getStdname() {
	return stdname;
}


public double getFee() {
	return fee;
}


public int getS1() {
	return s1;
}


public int getS2() {
	return s2;
}


public int getS3() {
	return s3;
}

public void print()
{
	System.out.println(stdid+" "+stdname+" "+fee+" "+s1+" "+ s2+" "+s3);
}
}


