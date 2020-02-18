package test;

class staticDemo{
	int x=10;
	static int y=20;
	
	public void show() {
		System.out.println(x);
	}
}


public class stat {
	public static void main(String args[]) {
		staticDemo d= new staticDemo();
		staticDemo d1= new staticDemo();
		staticDemo d2= new staticDemo();
		System.out.println(d.x);
		System.out.println(d.y);
		d2.x=50;
		d1.y=30;
		System.out.println(d.x);
		System.out.println(d2.y);
		
	}

}
