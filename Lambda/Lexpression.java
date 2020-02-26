package Lambda;

public class Lexpression {
public static void main(String[] args) {
//	MyThread t = new MyThread();
//	Thread thread = new Thread (t);
//	thread.start();
//	Runnable r =() -> System.out.println("Hello runnable");
//	Thread t = new Thread(r);
//	t.start();
	
	Hello h =()->"good bye";
	System.out.println(h.greetings());
	Hello h1 =()->"good morning";
	System.out.println(h1.greetings());
	Hello h2=()->"Goodnight";
	System.out.println(h2.greetings());
}
}
//class MyThread implements Runnable {
//
//	@Override
//	public void run() {
//System.out.println("hello runnable");		
//	}	
//}
@FunctionalInterface
interface Hello{
	String greetings();
	//public void display();
}