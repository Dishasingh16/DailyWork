package test;

public class Shtring {
	public static void main(String args[]) {
		String msg="I am what I am";
		
		String year="  deal with it";
		
		String city1="pune";
		String city2="mumbai";
		String city3="pune";
		
		String city4= new String("pune");
		String city5= new String("mumbai");
		String city6= new String("pune");
		
		String listen=msg.concat(year);
		
		System.out.println(city1==city3);
		System.out.println(city1==city6);
		System.out.println(+msg.length());
		System.out.println(listen);
		
		
		System.out.println(msg.toUpperCase());   
		System.out.println(msg.toLowerCase());
		System.out.println(msg.indexOf("what"));
		
		String txt = "It\'s alright.";
		
		System.out.println(txt);
		
		char ch=msg.charAt(3);
		
		System.out.println(ch);
		
		System.out.println(msg.compareTo(year));
		
		System.out.println(msg.contains("I am"));
		
		
		
		
		
	}
}
