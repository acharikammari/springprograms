package com.sathya.Spring.Student;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Autowired
	 private EmailService emailService;
	@Autowired
	 private JavaCourse javaCourse; 
//
//	public EmailService getEmailService() {
//		return emailService;
//	}
//	@Autowired
//	public void setEmailService(EmailService emailService) {
//		this.emailService = emailService;
//	}
//	public JavaCourse getJavaCourse() {
//		return javaCourse;
//	}
//	@Autowired
//	public void setJavaCourse(JavaCourse javaCourse) {
//		this.javaCourse = javaCourse;
//	}
	 
	
	
	 public void details()
	 {
		 emailService.message();
		 javaCourse.courseInfo();
	 }
//	 @Autowired
//public Student(EmailService emailService, JavaCourse javaCourse) {
//	super();
//	this.emailService = emailService;
//	this.javaCourse = javaCourse;
//}
	
}
