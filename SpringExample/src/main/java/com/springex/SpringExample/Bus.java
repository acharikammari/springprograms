package com.springex.SpringExample;

public class Bus implements Vechile
{

	private String BusType;
	private String maxSpeed;
	
	public String getBusType() {
		return BusType;
	}
	
	public void setBusType(String busType) {
		BusType = busType;
	}

	public String getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void move() 
	{
		System.out.println("your selected bud vechile");
		System.out.println("busType"+BusType);
		System.out.println("maxSpeed"+maxSpeed);
		
	}

}
