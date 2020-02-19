package test;
	
	
	
public class quest {
	
	 
	public static void main(String args[]) {
	
	String ish = "Global Warming";
		if (ish.length() == 3) 
		{
			System.out.println(ish);
			} 
		else if (ish.length() > 4)
		{
		String word =	ish.substring(ish.length() - 4);
			System.out.println(word);
			} 
		else {
			System.out.println(ish); //displays last four characters of given string
		}
		
		boolean isAlphaNumeric = (ish != null) &&
	             ish.chars().allMatch(Character::isLetterOrDigit);
	     System.out.println(isAlphaNumeric);
		
		
		System.out.println(ish.substring(4, 9));
	
		System.out.println(ish.indexOf("Wa"));
		
		System.out.println(ish.toUpperCase());   
		
		System.out.println(ish.toLowerCase());
		
		System.out.println(ish.substring(4));
		
		int len = ish.length();
        String trimf4 = ish.substring(len-4);
        System.out.println(trimf4);
		
		String alternative = ish.replaceAll("a", "*");
		System.out.println(alternative);
		
		System.out.println(bTitleCase(ish));
	
		
	}
	public static boolean bTitleCase(String s) 
	{
			
		 boolean result = false;
		String arr[] = s.split("\\st");
		
		for(int i=0;i<arr.length;i++) {
			char ch=arr[5].charAt(0);
			if(ch>=65&&ch<=90) {
				result =true;
			}
			else {
				result=false;
				break;
			
		}
}
		return result ;
	}
	}

	
