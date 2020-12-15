package com.demoPrograms;//an interface is collections of abstraction methods
                         //an interface cannot be instantiated
interface Myinterface {
public static final int x=51;//by default all the variable in interface are final and static,so we cannot change the x value,
public abstract void m1();//in interface if any method is overriding that method access specifiar is public
}

interface interfacedemo1{
 public static final int y=34;
    default void m3() {//in interface we can use default sepcifier and static method
System.out.println("from deafult");
		} 
    static void m4() {
    	System.out.println("iam staic method");//  in interface we can use static method
    }
	 }
interface myinterface1 extends Myinterface,interfacedemo1{
public static int z=32;
public  abstract void m2();
	  }
class  Interfacedemo implements myinterface1 {//using one class u can implemtns so many interface
				 public void m1() {
					System.out.println("welcom");
				 }
				 public void m2() {
						System.out.println("welcome buddy");
					 }
				 public void m3() {
						System.out.println("welcome sunny");
					 }
	  //An interface in Java can contain abstract methods and static constants. By default, all the methods in the interface are public and abstract.
	  //An interface is an entity that has only abstract methods as its body. It can also have static final variables in it.
	public static void main(String[] args) {//we cannot create constrctors in interface
		Myinterface mi=new Interfacedemo ();//we can create referncevariable t0 parent class 
		Interfacedemo id=new Interfacedemo ();
	
		System.out.println(x);//the variable is staic so we can cl directly
	}
	  }
//So just like class, an interface can also have methods and variables but note that the methods are abstract (without implementation) and variables are static.
	  
//class to class is extends(single)
//class to interface is implements(any num)
//interface to interface is extends(any num)
//Interfaces are blueprints for a class. They tell the class what to do through their methods.
//An interface specifies abstract methods and classes implementing that interface should also implement those methods.
//If a class implementing the interface does not define all the methods of the interface, then that class becomes an abstract class./


