package com.demoPrograms;//we use  overloading to provide flexibilty to the user,so that user can use one method to perform diff oeprations

public class MethodOverLoadingdemo {//same method name with diff type of parameters,and it should have one or more methods
void add(int x,int y) {//it is said to compiler time polymorpisam//complier will decide what method excutes depends upon what values and what parametrs u gave
	System.out.println("the result 1:"+(x+y));
                      }//u cannot create methods with same parameters,u choose type of,order of parameters 
void add(int x,int y,int z) {
	System.out.println("the result 2:"+(x+y+z));
                            }
	public static void main(String[] args) {
		MethodOverLoadingdemo mld=new MethodOverLoadingdemo();//we can apply overloading to instance method
		mld.add(90, 7);                                       //constructors
		mld.add(8, 9, 10);                                    //static method
                                                              // main method                                                             
		
	                                       }

}
  class StaticMethodOverLoading{//overloading can be applied in same class and child class
	    
	  static void show(double x) {
		  System.out.println("welcome to double parameter");
	  }
	  static void show(int y){
		  System.out.println("welcome to int parameter");
	  }
	  public static void main(String[] args) {
		  show(4.6);
	  }
  }
  //is it method over loading appilcable to main method?yes 
  
  class mainmethodoverlaoding{
	  
	  public static void main(int [] args) {
		  System.out.println("int arry");
	  }
	  public static void main(int args) {
		  System.out.println("int parametre");
	  } 
	  public static void main(String[] args) {
		  main(new int[] {2,3,45,5});
		  main(12);
	  } 	  
  }
  class ConstructorOverloading{
	  ConstructorOverloading(){
		  System.out.println("zero parametrized constructor");
	  }
	  ConstructorOverloading(String name){
		  System.out.println("my name is :"+name );
	  }
	  public static void main(String[] args) {
		  ConstructorOverloading cld=new  ConstructorOverloading("sunny");
		  
	  }
	    }
  //inhertence over loading demo
  class InheritanceOverLoading{
	  void vechicle() {
		  System.out.println("i drive a car");
	  }
  }
  class overloading extends InheritanceOverLoading{
	  void show(int x) {
		  System.out.println("the value is:"+x);
	  }
	  public static void main(String[] args) {
		  overloading od=new overloading();
		  od.vechicle();
		  od.show(4);
	  }
  }
  
  
  
  
  
  
  
  
  
  
  
  
                               
