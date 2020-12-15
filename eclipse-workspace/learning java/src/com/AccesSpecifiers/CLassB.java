package com.AccesSpecifiers;

 class ClassB extends ClassA{//this is sub class(child) of ClassA

	public static void main(String[] args) {
		ClassB b=new ClassB();
		//System.out.println(b.x);//we can access defalut variable in subclass and it has to be to same pacakge
		System.out.println(b.x);//we can access protected var in sub class also

	}

}
 class DataClass {
	    private String strname;    
	 
	// getter method
	    public String getName() {
	        return this.strname;
	    }
	    // setter method
	    public void setName(String name) {
	        this.strname= name;
	    }
	}
	public class Main {
	    public static void main(String[] main){
	        DataClass d = new DataClass();       
	 
	 // access the private variable using the getter and setter
	        d.setName("Java Programming");
	        System.out.println(d.getName());
	    }
	}