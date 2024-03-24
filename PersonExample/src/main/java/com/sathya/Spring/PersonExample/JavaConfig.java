package com.sathya.Spring.PersonExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig 
{
	@Bean
	public Person person1()
	{
		Person person=new Person();
		person.setName("surendra");
		person.setEmail("surendra@gamil.com");
		return person;
	}
	
	@Bean
	public Person person2()
	{
		Person person=new Person();
		person.setName("sudharshan");
		person.setEmail("sudharshan@gamil.com");
		return person;
	}
	
	@Bean
	public Person person3()
	{
		Person person=new Person();
		person.setName("surya");
		person.setEmail("surya@gamil.com");
		return person;
	}
	
}
