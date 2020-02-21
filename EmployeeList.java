package test;
import java.util.ArrayList;
import java.util.Collections;
public class EmployeeList {
public static void main(String[] args) {
	
	ArrayList<Employee> List = new ArrayList<>();
	addEmployees(List);
	//Collections.sort(List);
	//SortById sbi =new SortById();
	Collections.sort(List,new SortByName());
	for(Employee emp : List) {
		System.out.println(emp);
	}

}
private static void addEmployees(ArrayList<Employee> list) {
								//int id, String name, String address, String designation, int age, double salary, long phone
	Employee emp1 = new Employee(1234,"vijay","banglore","developer",20,412141.22,7679879L);
	Employee emp2 = new Employee(2234,"sujay","mumbai","software engineer",19,32214.24,9479844L);
	Employee emp3 = new Employee(3234,"jay","pune","test engineer",18,332141.26,8879834L);
	Employee emp4 = new Employee(4234,"disha","indore","devops engineer",21,342141.28,7779822L);
	list.add(emp1);
	list.add(emp2);
	list.add(emp3);
	list.add(emp4);
	
}
}
