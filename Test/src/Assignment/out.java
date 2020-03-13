package Assignment;

class Aw{
	public int i;
	public Aw(int i) {
		this.i=i;
	}
}

public class out {
public static void main(String[] args) {
Aw a1=new Aw(334);
Aw a2 = a1;
a2.i=988;
System.out.println(a2.i+"\t"+a1.i);
}
}

//output

//Exception in thread "main" java.lang.NullPointerException
//at Test/Assignment.out.main(out.java:14)
