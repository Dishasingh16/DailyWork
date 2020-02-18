package test;
import java.util.Scanner;

public class quuess {
	
	public static void main(String[] args)
	{
	int count = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("lowest ");
	int x=sc.nextInt();
	System.out.println("highest ");
	int y=sc.nextInt();
	    for(int i = x; i<=y; i++)
	    {
	        String number = String.valueOf(i);
	        while(number.contains("1"))
	        {
	            number= number.substring(number.indexOf("1")+1);
	            count++;
	        }
	    }
	    System.out.println(count);
	}
	}


