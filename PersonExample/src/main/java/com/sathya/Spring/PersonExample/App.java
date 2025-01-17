 package com.sathya.Spring.PersonExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
       
    	//get the bean
    	
    	Person person=context.getBean("person1",Person.class);
    	person.personInfo();
    	
    	System.out.println("******************");
    	
    	Person person2=context.getBean("person2",Person.class);
    	person2.personInfo();
    	
    	System.out.println("*******************");
    	
    	
    	Person person3=context.getBean("person3",Person.class);
    	person3.personInfo();
    	
    }
}
