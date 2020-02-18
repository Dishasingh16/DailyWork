package test;

import java.util.Scanner;

 class Human {
	void blue() {
		
	System.out.println("welcome");
	}}

class Employee extends Human {
	void newz() {
		
	System.out.println("wait");
}		}

class Hr extends Employee {
	void form() {
		System.out.println("hi");
	}

}

	class Manager extends Employee {
	void form2() {
		System.out.println("hello");

	}
}

		class Developer extends Manager {
		void form3() {
			System.out.println("hey");
			}

		}

		class Tester extends Manager {
		void form4() {
			System.out.println("namaste");
			}
	}
class inherit{
		public static void main (String args[]) {
		Tester obj=new Tester ();
		obj.form4();
		
		Developer obj2=new Developer();
		obj2.form3();
		
		Hr obj3=new Hr();
		obj3.form();
		obj3.newz();
		obj3.blue();
		}
		}

