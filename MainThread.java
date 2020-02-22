
public class MainThread {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();//it is a static method inside the thread class
		
		System.out.println(t);//check output a thread is created by main method.

//[main (name of method which is currently executing),5(priority),main(Name of Daemon)]
	//1 mini priority 5 normal priority  10 highest !
	System.out.println(t.getName());
	t.setName("dam dazzle 1");
	System.out.println(t);
	System.out.println(t);
	System.out.println(t.getPriority());
	System.out.println("is daemon ? :" +t.isDaemon());
	}
}
