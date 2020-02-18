package test;
 import java.util.Scanner;


public class ques {

	public static void main(String args[]) {
		double lowest, highest,sum=0,div;
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("enter lowest range");
		lowest=sc.nextDouble();
	System.out.println("enter highest range");
		highest=sc.nextDouble();
		while(lowest<highest) {
			/10=div;
			if(div==1) {
				sum=sum+1;
			
			System.out.println("number of ones==" +sum);
			}
		}
		
	}
}
