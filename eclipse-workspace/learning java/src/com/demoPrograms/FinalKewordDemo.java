package com.demoPrograms;

public final class FinalKewordDemo {

	public static void main(String[] args) {//
		final int x=30;//if i applied final keyword to variable we cannot modify the value
		x=x+5;//we cannot modify the value
		System.out.println(x);
	}
 final void dispaly() {//if i apply final keyword to method it cannot overridden
	int x=20;
	System.out.println(x);
	
}
}
class finaldemo2 extends  FinalKewordDemo{//inheritance//if we applied final  keyword to parent class we cannot extend
	public static void main(String[] args) {
		 finaldemo2 fd=new  finaldemo2 ();
		 fd.dispaly();
		
	}
	void dispaly() {//if parent class methodname and child method name same it said to be overridden
		int y=28;
		System.out.println(y);
		
	}
}
//variables:constant
//class:cannot be extended
//method:cannot overridden