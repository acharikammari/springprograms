package com.sathya.Spring.PatientEx;

public class Pharmacy 
{
	private String name;
	private String location;
	
	public Pharmacy(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	public void PhrmacyInfo()
	{
		System.out.println("Phrmacy name:"+name);
		System.out.println("Phrmacy location:"+location);
	}
}
