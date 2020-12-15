package com.demoPrograms;

public class ParametrizedConstructor {
int rollno;
String name;
String branch;
int age;
String caste;
Double fees;
	public static void main(String[] args) {
		ParametrizedConstructor pc=new ParametrizedConstructor(34, "sunny");
		ParametrizedConstructor yt=new ParametrizedConstructor("skec");
		ParametrizedConstructor ty=new ParametrizedConstructor(23,"muslim",34.5);
	}
	ParametrizedConstructor(int r,String n){
		rollno=r;
		name=n;
		System.out.println("the rollno is:"+rollno+"  "+"the name is:"+name);	
		
	}
	ParametrizedConstructor(String b){
		branch=b;
		System.out.println("the branch is="+b);
	}
	ParametrizedConstructor(int i,String s,double d){
		age=i;
		caste=s;
		fees=d;
		System.out.println("the Age is="+(age)+"  "+"the Caste is="+(caste)+" "+"the college Fee is="+(fees) );
	}
}
