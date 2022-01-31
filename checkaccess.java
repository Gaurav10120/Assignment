package com.simplilearn;

public class checkaccess {
	public static void main(String[]args)
	{
		ProtectedAccessSpecfier obj=new ProtectedAccessSpecfier();
		obj.display(); //able to call protected
		//obj.test();    //not able to call private method
		obj.hello();   //able to call public method
		obj.world();   //able to call default method
	}

}
