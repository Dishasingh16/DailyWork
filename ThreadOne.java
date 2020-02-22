
public class ThreadOne extends Thread {

	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			
			if(i % 2 != 0) {
			System.out.println("thread " +i);
			}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
		}
	}
	
}
