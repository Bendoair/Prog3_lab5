package Capitalism;
import java.util.*;

public class Application {
	
	
	public static void main(String[] args) {
		Fifo f = new Fifo();
		
		
		
		
		Producer factory1 = new Producer(f, "product1", (int)Math.round(Math.random()*10));
		Producer factory2 = new Producer(f, "product2", (int)Math.round(Math.random()*10));
		Producer factory3 = new Producer(f, "product3", (int)Math.round(Math.random()*10));

		
		
		
		Consumer consumer1 = new Consumer(f, "consumer1", (int)Math.round(Math.random()*10));
		Consumer consumer2 = new Consumer(f, "consumer2", (int)Math.round(Math.random()*10));
		Consumer consumer3 = new Consumer(f, "consumer3", (int)Math.round(Math.random()*10));
		Consumer consumer4 = new Consumer(f, "consumer4", (int)Math.round(Math.random()*10));

		
		
		
		
		
		ArrayList<Thread> threads = new ArrayList<Thread>();
		
		threads.add(new Thread(factory1));
		threads.add(new Thread(factory2));
		threads.add(new Thread(factory3));
		
		threads.add(new Thread(consumer1));
		threads.add(new Thread(consumer2));
		threads.add(new Thread(consumer3));
		threads.add(new Thread(consumer4));
		
		for (Thread d : threads){
			d.start();
		}
		
		
	}
}
