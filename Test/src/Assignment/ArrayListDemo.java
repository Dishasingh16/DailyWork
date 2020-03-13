package Assignment;

import java.util.*;
public class ArrayListDemo {
	String name;
		int grades;
		public static void main(String args[]) {
			ArrayList<Student> list=new ArrayList<>();
			Student s1=new Student("Disha",55);
			Student s2=new Student("trishaa",99);
			Student s3=new Student("ishaa",88);
			Student s4=new Student("Abhi",59);
			Student s5=new Student("rushali",60);
			list.add(s1);
			list.add(s2);
			list.add(s3);
			list.add(s4);
			list.add(s5);
			Check(s1);
			Check(s2);
			Check(s3);
			Check(s4);
			Check(s5);
		}
		public static void Check(Student s)
		{
			if(s.getGrades()>=80)
				 System.out.println(s.getName()+" got Distinction");
			else if(s.getGrades()<80 && s.getGrades()>=60)
				    System.out.println(s.getName()+" got A grade");
			else if(s.getGrades()<60 && s.getGrades()>=50)
				    System.out.println(s.getName()+" got B grade");
			else 
				System.out.println(s.getName()+" is Fail");
		}
	}

