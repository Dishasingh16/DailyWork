package com.cts.training.controller;

import java.util.List;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAOImpl;
import com.cts.training.dao.impl.EmployeeDao;

import java.util.Scanner;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDao employeeDAO = new EmployeeDAOImpl();
		Scanner sc= new Scanner(System.in);
		
		//List <Employee> list= employeeDAO.getAllEmployees();
		//list.forEach(System.out::println);
		//Employee emp =employeeDAO.getEmployeeById(3);
		//emp.setName("disha");
		//employeeDAO.updateEmployee(emp);
		//Employee emp1 =employeeDAO.getEmployeeById(3);
		//employeeDAO.deleteEmployee(emp1);
		int ch;
		char choice;
		do {
			System.out.println("---EMPLOYEE MGMT---");
			System.out.println("1.UPDATE");
			System.out.println("2.DELETE");
			System.out.println("3.GET BY ID");
			System.out.println("4.GET ALL EMPLOYEES");
			System.out.println("5.EXIT !");
		System.out.println("enter ur choice");
		ch=sc.nextInt();
		switch (ch)	{
			case 1:
				Employee emp =employeeDAO.getEmployeeById(20);
				System.out.println("enter new name");
				String new_name=sc.next();
				emp.setName(new_name);
				employeeDAO.updateEmployee(emp);
				System.out.println("successfully updated");
				break;
			case 2:
				Employee emp1 =employeeDAO.getEmployeeById(3);
				employeeDAO.deleteEmployee(emp1);
				System.out.println("successfully deleted");
				break;
			case 3:
				Employee emp3 =employeeDAO.getEmployeeById(3);
				
				break;
			case 4:
				List <Employee> list= employeeDAO.getAllEmployees();
				list.forEach(System.out::println);
				break;
			case 5:
				System.exit(0);
				}
		System.out.println("do want to cont ? Y/N");
		choice=sc.next().charAt(0);
		}
		while(choice!='N');
		
		
		
	}

}
