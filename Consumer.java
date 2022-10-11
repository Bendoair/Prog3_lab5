package Capitalism;

public class Consumer extends Thread{
	Fifo fifo;
	String szoveg;
	int sleeptimer;
	
	Consumer(Fifo f, String s, int n){
		fifo = f;
		szoveg = s;
		sleeptimer = n;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Consumed: " + fifo.get());
				Thread.sleep(sleeptimer*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
