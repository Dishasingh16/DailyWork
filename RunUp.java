
public class RunUp implements Runnable {

	
		
		@Override
		public void run() {
			for(int i=1;i<=10;i++) {
				
				if(i % 2 != 0) {
				System.out.println("thread 1 : " +i);
				}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			
			}
		}
		}
