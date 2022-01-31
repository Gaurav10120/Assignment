package com.simplilearn;

public class PrivateAccessSpecfier {
	private int a=15;
	public static void main(String[]args)
	{
		PrivateAccessSpecfier obj= new PrivateAccessSpecfier();
		System.out.println("value of a a"+obj.a);
	}

}
