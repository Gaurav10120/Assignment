package com.simplilearn;

public class ProtectedAccessSpecfier {
	
	protected void display()
	{
		System.out.println("You are accessing protected method of this class");
	}
	
	private void test()
	{
		System.out.println("My private method");
	}
	public void hello()
	{
		System.out.println("public method");
	}
	void world()
	{
		System.out.println("Default method");
	}
	 
	// Access All method in same class
	
	public static void main(String[]args)
	{
		ProtectedAccessSpecfier obj=new ProtectedAccessSpecfier();
		obj.display(); //able to call protected
		obj.test();    //able to call private method
		obj.hello();   //able to call public method
		obj.world();   //able to call default method
	}

}
