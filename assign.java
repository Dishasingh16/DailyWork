package test;
import java.util.Scanner; 
class Employer{
	 
	public void details(){
		  int number ;
		  String name ;
		  Scanner sc=new Scanner(System.in);
		 
		  System.out.println("Enter the employer number ");
	        number=sc.nextInt();
	      System.out.println("Enter the employer name ");
	        name=sc.next();
	 }
	}

class Salary extends Employer{
	 	double basicPay ;
	 	int pf ;
	 	int tax ;
	 	Scanner vc=new Scanner(System.in);
	 public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	 System.out.println("Enter the employer's basic pay ");
	        basicPay=vc.nextDouble();
	}
 }
 
class assign {

	public static void main(String args[]) {
		Salary obj=new Salary();
		obj.getBasicPay();
		obj.setBasicPay(2200);
		obj.details();
		
		System.out.println("the actual basic pay is"+obj.getBasicPay());
		//System.out.println(+obj.details());
	}
}
