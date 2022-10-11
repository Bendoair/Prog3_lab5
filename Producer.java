package Capitalism;

public class Producer extends Thread{
	Fifo fifo;
	String szoveg;
	int sleeptimer;
	
	Producer(Fifo f, String s, int n){
		fifo = f;
		szoveg = s;
		sleeptimer = n;
	}
	
	@Override
	public void run(){
		
		
			
		try {
			fifo.put(szoveg);
			System.out.println("Produced: "+ szoveg + " "  + (System.currentTimeMillis()%100000));
			Thread.sleep(sleeptimer*1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
