package com.simplilearn;

public class TestAccessSpecfier {
	public static void main(String[]args)
	{
		//Default accessiable in same package
		
		DefaultAccessSpecfier def=new DefaultAccessSpecfier();
		def.disply();
		
		//Access private variable to another class
		PrivateAccessSpecfier obj= new PrivateAccessSpecfier();
		//System.out.println("value of a a"+obj.a);
		
		ProtectedAccessSpecfier obj2=new ProtectedAccessSpecfier();
		obj2.display();
	}

}
