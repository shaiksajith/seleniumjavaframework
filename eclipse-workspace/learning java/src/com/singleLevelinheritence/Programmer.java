package com.singleLevelinheritence;

public class Programmer extends Employer {
float bonus=26568;//child class variable
	public static void main(String[] args) {
		Programmer p=new Programmer();//in inheritence we create object for child class and using that obj we call parent members
System.out.println("total salary:"+(p.salary+p.bonus));//single level inheritence
	}

}
