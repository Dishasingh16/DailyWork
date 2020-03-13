package Assignment;

public class Q4 {
	String name;
	int grades;
	public static void main(String args[]) {
		ArrayList<Q4_Student> list=new ArrayList<>();
		Q4_Student s1=new Q4_Student("disha",5);
		Q4_Student s2=new Q4_Student("Ayush",5);
		Q4_Student s3=new Q4_Student("trisha",2);
		Q4_Student s4=new Q4_Student("neeraj",9);
		Q4_Student s5=new Q4_Student("amisha",5);
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
	public static void Check(Q4_Student s)
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
