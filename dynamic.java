package test;

class C
{
	public void display() {
		int y=20;
		System.out.println("class  B");
	}
}

class D extends  C
{
	@Override
	public void display() {
		System.out.println("class D");
	}
}


public class dynamic {

	public static void main(String args[]) {
	C obj=new D();
	obj.display();
	}
	}
