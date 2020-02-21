package test;

import java.util.Comparator;

public class SortById implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(this.age > emp.age) {
			return -1;
		}
		else if(this.age==emp.age) {
			return 0;
		}else {
			return 1;
		}
		  		return 0;
	}

	
}
