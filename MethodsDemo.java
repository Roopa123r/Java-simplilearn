package com.mphasis.Method;

public class MethodsDemo {

	//call by value
		

		int val=150;

		int operation(int val) {
			val =val*10/100;
			return(val);
		}
		
		public static void main(String args[]) {
			MethodsDemo d = new MethodsDemo();
			System.out.println("Before operation value of data is "+d.val);
			d.operation(100);
			System.out.println("After operation value of data is "+d.val);
		
		
		}


}