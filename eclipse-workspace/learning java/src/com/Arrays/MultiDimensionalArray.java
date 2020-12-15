package com.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		//syntax:datatype arrname[][]=new datatype[size1][size2];
		//step:1
		/*int[][]arr=new int[2][2];
		
		arr[0][0]=1;
		arr[0][1]=6;
		arr[1][0]=5;
		arr[1][1]=2;
		
		for(int[]x:arr) {
			for(int y:x) {
				System.out.println(y+"  ");
			}
			System.out.println();
		}*/
		//step2
		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int[]x:arr) {
			for(int y:x) {
				System.out.println(y+"  ");
			}
			System.out.println();
		}		
	}

}
