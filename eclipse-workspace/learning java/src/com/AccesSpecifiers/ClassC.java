package com.AccesSpecifiers;
public class ClassC {

	public static void main(String[] args) {
		ClassA a=new ClassA();
		//System.out.println(a.x);//we can access default var in same pakage
		System.out.println(a.x);//we can access protected var in same pakcges class
	}

}
