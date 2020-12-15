package com.List;
	import java.util.LinkedList;  
	import java.util.List;  
	public class List1 { 
	  
	 
	public static void main(String[] args) {  
	        //define lists
	        List<Integer> first_list= new LinkedList<>();  
	        List<Integer> second_list = new LinkedList<>();
	        List<Integer> third_list = new LinkedList<>();
	        //initialize lists with values
	        for (int i=0;i<11;i++){  
	            first_list.add(i); 
	             second_list.add(i);  
	              third_list.add(i*i);  
	        }
	        //print each list
	        System.out.println("First list: " + first_list);
	        System.out.println("Second list: " + second_list);
	        System.out.println("Third list: " + third_list);   
	 
	//use equals method to check equality with each list to other
	if (first_list.equals(second_list) == true)
	System.out.println("\nfirst_list and second_list are equal.\n");
	else
	System.out.println("first_list and second_list are not equal.\n");
	 
	if(first_list.equals(third_list))
	System.out.println("first_list and third_list are equal.\n");
	else
	System.out.println("first_list and third_list are not equal.\n");
	if(second_list.equals(third_list))
	System.out.println("second_list and third_list are equal.\n");
	else
	System.out.println("second_list and third_list are not equal.\n");
	}
	}
}
