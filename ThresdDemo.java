
public class ThresdDemo {
public static void main(String[] args) {
	
	System.out.println(Thread.currentThread().getName());
	// here v hv only 1 thread(main)
	ThreadOne threadOne = new ThreadOne();
	ThreadTwo threadtwo = new ThreadTwo();
	Thread t1 = new Thread(threadOne); 
	Thread t2 = new Thread(threadtwo);
	t1.start();//ready state
	t2.start();
	Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);
	
	//for (int i=1;i<=5;i++) {
	//	System.out.println(Thread.currentThread().getName()+"  : "+i);
	//}
	
	System.out.println("Main thread Priority"+Thread.currentThread().getPriority());
	System.out.println("Thread-1 priority :" +t1.getPriority());
	System.out.println("Thread-2 priority :" +t2.getPriority());


}
}
