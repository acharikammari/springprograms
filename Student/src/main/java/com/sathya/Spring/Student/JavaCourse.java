package com.sathya.Spring.Student;

import org.springframework.stereotype.Component;

@Component
public class JavaCourse implements CourseService

{

	@Override
	public void courseInfo() {
		System.out.println("java full Stack development....");
		System.out.println("java, adv java,spring,boot,mycroServices");
		
	}

}
