package com.sathya.SpringExample;

public class GreetingImpl implements Greeting
{

	@Override
	public void greet() {
		System.out.println("this is javabasedconfigaration");
		
	}
	public GreetingImpl()
	{
		System.out.println("object created");
	}

	

}
