
public class ThreadTwo extends Thread {


	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("thread " +i);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
	}
}
