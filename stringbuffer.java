package test;

public class stringbuffer {

	public static void main(String args[])
	{
		StringBuffer sb= new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hello to java version 8");
		System.out.println(sb.capacity());
		sb.append("hello to java version 9");
		System.out.println(sb.capacity());
		sb.insert(2, "nope");
		System.out.println(sb);
		sb.replace(7, 9, "hey");
		System.out.println(sb);
		sb.delete(7, 9);
		sb.reverse();
		
	}
}
