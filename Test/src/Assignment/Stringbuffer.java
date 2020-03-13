package Assignment;

public class Stringbuffer {

	public static void main(String[] args) {
		
		String str1="java";
		String str2=new String ("java");
		String str3 = "java";
		String str4 =new String("java");
		StringBuffer sb1= new StringBuffer("java");
		StringBuffer sb2= new StringBuffer("java");
	//stringbufferclass doesnt has its equal method ! hence can"t override !!
		if (sb1.equals(sb2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
	
	}
}
