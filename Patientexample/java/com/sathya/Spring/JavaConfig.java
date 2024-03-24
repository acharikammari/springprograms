package com.sathya.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig 
{
	@Bean
	public Doctor doctor()
	{
		Doctor doctor=new Doctor(123,"Surendra");
		return doctor;
	}
	
	@Bean
	public Pharmacy pharmacy()
	{
		Pharmacy pharmacy =new Pharmacy("suresh","ameetper");
		return pharmacy;
	}
	@Bean
	public Patient patient()
	{
		Patient patient=new Patient("mahesh",21,doctor(),pharmacy() );
		return patient;
		
	}
	
	
}
