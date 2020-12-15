package com.demoPrograms;

public class ArrayAsParameter {
int sum;
	public static void main(String[] args) {// array as parameter with return type
int [] sun= {12,33,45,66,78};
ArrayAsParameter sunny =new ArrayAsParameter();
int total=sunny.display(sun);
System.out.println(total);
} 
	int display(int[] sam) {
		for(int e:sam) {
			sum=sum+e;
		}
		return sum;	
	}
	
}
/*int[] sun= {12,34,56,78};
ArrayAsParameter ar=new ArrayAsParameter();
ar.dispaly(sun);
}
void dispaly(int[] temp) {
for(int z:temp) {
	System.out.println(z);
}*/
