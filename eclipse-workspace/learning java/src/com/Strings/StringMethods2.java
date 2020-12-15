package com.Strings;

public class StringMethods2 {

	public static void main(String[] args) {
		/*String data="     hello india   ";
		System.out.println("the length of the string before delation="+data.length());
		 data=data.trim();
		 System.out.println("the length of the string after delation="+data.length());*/
		 
StringBuffer sb=new StringBuffer("hai sajith");
System.out.println(sb.append(","+"hai sammer"));
System.out.println(sb.deleteCharAt(6));
System.out.println(sb.delete(4, 7));
System.out.println(sb.substring(5, 8));
System.out.println(sb.substring(7));
System.out.println(sb.insert(3, "sunny"));
}
}