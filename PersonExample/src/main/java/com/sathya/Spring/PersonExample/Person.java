package com.sathya.Spring.PersonExample;

public class Person 
{
	private String name;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void personInfo()
	{
		System.out.println("hey"+name+"welcome to sathya tech");
		System.out.println("your emailid"+email+"you will get the updates");
	}
}
