package Capitalism;

public class Producer implements Runnable{
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
		int i = 0;
		while(true) {
			
			try {
				fifo.put(szoveg + " " + i);
				System.out.println("Produced: "+ szoveg + " " + i + " " + (System.currentTimeMillis()%100000));
				i++;
				Thread.sleep(sleeptimer*1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
