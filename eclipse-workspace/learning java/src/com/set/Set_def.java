package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_def {

	public static void main(String[] args) {
		
		
		Set ids=new HashSet<>();
		
		ids.add("Prathap");
		
		ids.add(1235);
		
		ids.add(1235);
		
		ids.remove(123666);
		
	Iterator itr=ids.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
		
		
	}

}
