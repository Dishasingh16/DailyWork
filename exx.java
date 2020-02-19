/*Write a program which takes input as a string and sort all the alphabets in string.
    Example :
    1) If user gives input "helloword" then output string should be "dehllloorw".
    2) If user gives input "PROGRAMR" then output string should be "AGMOPRRR".*/




package test;
import java.util.Scanner;
import java.util.Arrays;

public class exx {
	
	public static void main(String args[]) {
		String str;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a word");
		str=sc.next();
		
		char tempArray[] = str.toCharArray(); 
		Arrays.sort(tempArray);
		
		System.out.println(tempArray);
		space();
		toggle();
		palindrome();
	}

	/*Wite a code to input string from terminal window. Use  Substrings.
e.g.
> Input String: Java programming is easy
Output should be:
Java
programming
is
easy */		
	public static void space() {
		String ish;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a sentence");
		ish=sc.nextLine();
		
		System.out.println(ish.replaceAll(" ", "\n"));	

	}
/* Write a code to input string from terminal window. Use chartAt. Toggle each alphabet case in output.
e.g.
> Input String: Java programming is easy
Output should be: jAvA PrOgRaMmInG Is EaSy*/	
	
	
	
	public static void toggle() {
		String tgs;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a sentence");
		tgs=sc.nextLine();
		char strr[]= tgs.toCharArray(); 
		 for (int i=0; i<strr.length; i++) 
		    { 
		        if (strr[i]>='A' && strr[i]<='Z') 
		            strr[i] = (char) (strr[i] + 'a' - 'A'); 
		        else if (strr[i]>='a' && strr[i]<='z') 
		            strr[i] = (char) (strr[i] + 'A' - 'a'); 
		    } 
		 System.out.println(strr);
	}
	
	public static void palindrome() {
		String x, y = "";
        Scanner s = new Scanner(System.in);
        System.out.print("string ");
        x = s.nextLine();
        int n = x.length();
        for(int i = n - 1; i >= 0; i--)
        {
            y = y + x.charAt(i);
        }
        if(x.equalsIgnoreCase(y))
        {
            System.out.println("yess");
        }
        else
        {
            System.out.println("nooo");
        }

	}
}

