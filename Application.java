package Capitalism;
import java.util.*;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Application {
	
	
	public static void main(String[] args) {
		Fifo f = new Fifo();
		
		
		
		
	
		
		
		
		
		
		
		
		ScheduledThreadPoolExecutor speFact = new ScheduledThreadPoolExecutor(10);
		ScheduledThreadPoolExecutor speCons = new ScheduledThreadPoolExecutor(10);
		
		
		int i = 0;
		while(i<30) {
			speFact.schedule(new Producer(f, "product", 1), 1, TimeUnit.SECONDS);
			speCons.schedule(new Consumer(f, "consumer", 1), 1, TimeUnit.SECONDS);
			i++;
		}
				
		
	}
}
