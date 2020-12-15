package com.maps;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {

	public static void main(String[] args) {
		Map<Integer,String> emp_names=new HashMap<Integer,String>();
		emp_names.put(1, "sunny");
		emp_names.put(2, "rajiya");
		emp_names.put(null, "sameer");
		emp_names.put(4, "khader");
		
		System.out.println(emp_names.get(3));
		
for (Entry<Integer, String> data : emp_names.entrySet()) {
			
			System.out.println(data.getValue());
			
		}
		System.out.println(emp_names.containsKey(3));
		
	}

}
