package com.sathya.Spring.Student;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService
{

	@Override
	public void message() {
		System.out.println("your email is checked");
		System.out.println("you will get the updates");
	}

}
