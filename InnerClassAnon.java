package com.mphasis.Anonymous;
//anonymous inner class
abstract class AnonymousInnerClass
{
		  public abstract void display();
			}


			public class InnerClassAnon {

			public static void main(String[] args) {
			AnonymousInnerClass i = new AnonymousInnerClass() {

			         public void display() {
			            System.out.println("Anonymous Inner Class");
			         }
			      };
			      i.display();
			   }
			}
