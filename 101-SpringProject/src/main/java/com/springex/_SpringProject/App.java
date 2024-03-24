package com.springex._SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    		ApplicationContext context=new ClassPathXmlApplicationContext("Spring_config.xml");
    		
    		System.out.println("*************");
    		
    		//get the object from container call your methods
    		
    		Greeting greeting=context.getBean("greet",GreetinImpl.class);
    		greeting.greet();
    		
    }
}
