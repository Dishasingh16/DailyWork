package test;

import java.util.Scanner;

public class SumDigit {
	public static void main (String args[]) {
		
		long a,sum,div;
 	    Scanner sc=new Scanner(System.in);

 	    System.out.println("Enter a number ");
        a=sc.nextLong();

       for(sum=0 ;a!=0 ;a/=10)

       {

    	   div=a%10;
    		sum=sum+div;	   ;

       }

       System.out.println("Sum of digits of a number is "+sum);               	  
}
	}


