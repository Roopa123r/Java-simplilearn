package Assistedprojects;

public class Typecastingproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Implicit Type Conversion");
		//implicit conversion
		byte t=65;
		short u=t;
		int v=u;
		long w=v;
		float x=w;
		double y=x;
		System.out.println("value of" + t);
		System.out.println("value of" + u);
		System.out.println("value of" + v);
		System.out.println("value of" + w);
		System.out.println("value of" + x);
		System.out.println("value of" + y);
		
		System.out.println("\n");
		
		System.out.println("Explicit type Conversion ");
		//explicit conversion
		double a=64.56;
		int b=(int)a;
		short c=(short)b;
		System.out.println("value of" + a);
		System.out.println("value of" + b);
		System.out.println("value of" + c);
	

	}

}
