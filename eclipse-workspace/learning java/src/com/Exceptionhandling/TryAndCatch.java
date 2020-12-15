package com.Exceptionhandling;

public class TryAndCatch {

	public static void main(String[] args) {
		try {
			int arr[]= {2,5};
			try {
			arr[4]=5;
			}
		catch(ArrayIndexOutOfBoundsException er) {
		er.printStackTrace();
		}
			arr[2]=3/0;
		}
			catch(ArithmeticException ae) {
				ae.printStackTrace();
				
			}
		
		
		         //if u assume ther will be 2 excetions so u create two catch blocks,in output the frst exceptionline only prints
			     //if u kknow thre will multiple exceptions we use nested try catch balck							
		}
/*catch(ArithmeticException ae) {
	ae.printStackTrace();	
}
		catch(ArrayIndexOutOfBoundsException er) {
			er.printStackTrace();
		}*/
	}


