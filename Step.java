//Given a number we need to find the number of times its digits need
// to be added so it becomes a single digit number .

package Training;

import java.util.Scanner;

public class Step {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int count=1,sum=0;
		  while(n > 0 || sum > 9) 
		    { 
		        if(n == 0) 
		        {       count++;
		            n = sum; 
		            sum=0;
		        } 
		        sum  =sum + n % 10; 
		        n = n  / 10; 
		    } 
		    System.out.println(count);
        } 
		
	}


