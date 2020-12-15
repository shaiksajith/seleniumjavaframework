package com.demoPrograms;

public class Constructor {//construtors are same as method type but dont have return type
int a;//they are excutes during object creation
	public static void main(String[] args) {//a class can have num of consturctors
		Constructor cn=new Constructor();//they are useful for assining values for instance variables
		cn.dispaly();//we have 1)zero parmaterized 2)single parmetrized
	}//always when object creation implicitily consturctor excutes
Constructor(){//zero parametrized
	a=10;
}
void dispaly() {
	System.out.println(a);
}
}
