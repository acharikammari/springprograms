package com.sathya.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@NoArgsConstructor
//
//@AllArgsConstructor
//@ToString

//@Data
//@AllArgsConstructor
//@NoArgsConstructor

@Builder
@ToString
public class Employee 
{
		private int empId;
		private String empName;
		private double empSalry;
}