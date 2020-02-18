package test;

class Ash{
	private int age=10;
	private double salary=20000;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class sample {

	public static void main(String args[]) {
		Ash obj= new Ash ();
		obj.getAge();
		obj.getSalary();
		obj.setAge(30);
		System.out.println("here have it" +obj.getAge());
		obj.getSalary();
		
	}
}
