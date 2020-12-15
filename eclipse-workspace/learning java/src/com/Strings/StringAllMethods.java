package com.Strings;

public class StringAllMethods {

	public static void main(String[] args) {
		String sun="i want to get a job";
		String sum="I want TO GET a job";
		
		
		System.out.println(sun.length());//length of string method
		System.out.println(sun.charAt(5));//charcter index position method
		System.out.println(sun.toUpperCase());//changes to uppercase
		System.out.println(sun.toLowerCase());//changes to uppercase
		System.out.println(sun.compareTo(sum));//compare both strings
      /*String str1="india";
		String str2="i";		
		System.out.println(str1.compareTo(str2));*/
System.out.println(sun.contains("want"));//checks matter
System.out.println(sun.concat(sum));//merges both string 
System.out.println(sun.equalsIgnoreCase(sum));//ignoers upper or lower letters
System.out.println(sun.equals(sum));//it checks both equal or not
System.out.println(sun.indexOf('w'));//it checks particular index of word
System.out.println(sun.substring(5));//it prints from 6th index postion
System.out.println(sun.toCharArray());//it needs array[] to print all words using for each
/*String str="india,america,japan";
   String[] raj=str.split("  ");
     for(String word:raj) {
    	 System.out.println(word);
     }*/

/*String path="C:\\Users\\tm\\Downloads\\POM_GIt_Maven_Jenkins_FrameWork-master";

int pos=path.lastIndexOf("\\")+1;

System.out.println(path.substring(pos));*/

/*String data="Welcome to testing masters";


char[] arr=data.toCharArray();

for (char c : arr) {
	System.out.println(c);
}*/

		
		
        
	}

}