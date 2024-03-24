package com.springex.SpringExample;

public class Car implements Vechile 
{
	private String fuelType;
	private int maxSpeed;
	
	
	

	public String getFuelType() {
		return fuelType;
	}




	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}




	public int getMaxSpeed() {
		return maxSpeed;
	}




	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}




	@Override
	public void move() 
	{
		System.out.println("your selected car vechile");
		System.out.println("maxSpeed"+maxSpeed);
		System.out.println("fuelType"+fuelType);
		
	}

}
