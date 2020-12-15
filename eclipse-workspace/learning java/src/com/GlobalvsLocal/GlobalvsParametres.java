package com.GlobalvsLocal;

public class GlobalvsParametres {
int a =23;
static int b=34;
	public static void main(String[] args) {
		 GlobalvsParametres sun=new  GlobalvsParametres();
sun.add(45, 89);
	}
public void add(int a,int b) {
	System.out.println((this.a+this.b)+(a+b));
}
}
