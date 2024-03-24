package com.sathya.Spring.PatientEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        
        //get the bean
        
        Patient patient=context.getBean("patient",Patient.class);
        patient.details();
    }
}
