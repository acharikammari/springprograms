package com.sathya.demo;

public class Test {

	public static void main(String[] args) {
//		//constructor injecting the values
//		Employee employee=new Employee(111,"surendra",10000.45);
//		System.out.println(employee);
//		
//		//setters are injecting the values
//		
//		Employee employee2 = new Employee();
//				employee2.setEmpId(111);
//				employee2.setEmpName("surenra");
//				employee2.setEmpSalry(10000.45);
//				System.out.println(employee2.getEmpId()+" "+employee2.getEmpName()+" "+employee2.getEmpSalry());
//				
		
		Employee employee =Employee.builder()
									.empId(1001)
									.empName("surendra")
									.empSalry(10000.45)
									.build();
		System.out.println(employee);
			
								

	}

}
