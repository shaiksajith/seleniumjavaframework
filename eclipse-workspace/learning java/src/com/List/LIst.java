package com.List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LIst {

	public static void main(String[] args) {
		
List<String> sun=new ArrayList<String>();
    sun.add("sunny");
    sun.add("sameer");
    sun.add("rajiya");
    sun.add("khader");
    System.out.println(sun.get(0));
    
    List<String>rfamily=new ArrayList();
        rfamily.add("fakeer");
        rfamily.add("usenamma");
	
    /*Iterator itr=sun.listIterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }*/
        
        
        
    // System.out.println(sun.size());
     System.out.println(sun.get(sun.size()-1));
     System.out.println(sun.addAll(rfamily));
     System.out.println(sun.contains("sameer"));
	}
}