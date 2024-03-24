package com.sathya.Spring.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sathya.Spring.Student")
public class JavaConfig 
{
//	@Bean
//	public EmailService emailService()
//	{
//		EmailService emailService = new EmailService();
//		return emailService;
//	}
//	@Bean
//	public JavaCourse javaCourse()
//	{
//		JavaCourse javaCourse =new JavaCourse();
//		return javaCourse;
//	}
//	
//	@Bean
//	public Student student()
//	{
//		Student student= new Student(emailService(),javaCourse());
//		
//		// we are setting email,javcourse to student
//		student.setEmailService(emailService());
//		student.setJavaCourse(javaCourse());
//		return student;
//		
//	}
}
