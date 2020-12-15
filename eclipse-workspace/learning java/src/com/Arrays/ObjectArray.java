package com.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Object[] mom=new Object[2];
      mom[0]="sun";
      mom[1]=98;
      
      for(Object sam:mom){
    	  System.out.println(sam);
      }
      for(int i=0;i<=mom.length-1;i++) {
    	  System.out.println(mom[i]);
      }
	}

}
