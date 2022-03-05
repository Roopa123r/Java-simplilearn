package com.mphasis.constructor;

  //Default constructor
class Emp{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class Constructor {

public static void main(String[] args) {

	Emp emp1=new Emp();
	Emp emp2=new Emp();

	emp1.display();
	emp2.display();
	
	Std std1=new Std(2,"Lucky");
	Std std2=new Std(10,"Sandy");
	std1.display();
	std2.display();
	
	}
}
   
           //parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}




	
		}
