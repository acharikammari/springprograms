package com.sathya.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person 
{
	@Autowired
	private HomeloanService homeloanService;
	@Autowired
	private RealestateService realestateService;
	
//	public HomeloanService getHomeloanService() {
//		return homeloanService;
//	}
//	@Autowired
//	public void setHomeloanService(HomeloanService homeloanService) {
//		this.homeloanService = homeloanService;
//	}
//	public RealestateService getRealestateService() {
//		return realestateService;
//	}
//	@Autowired
//	public void setRealestateService(RealestateService realestateService) {
//		this.realestateService = realestateService;
//	}
	
	
	
	public void details()
	{
		homeloanService.loan();
		realestateService.realestate();
	}
//@Autowired
//public Person(HomeloanService homeloanService, RealestateService realestateService) {
//	super();
//	this.homeloanService = homeloanService;
//	this.realestateService = realestateService;
//}
	
	
	 
}

