package Capitalism;
import java.util.*;
import java.lang.Thread;

public class Fifo {
	LinkedList<String> sor;
	
	Fifo(){
		sor = new LinkedList<String>();
	}
	
	synchronized public void put(String s) throws InterruptedException {
		while (!(sor.size() < 10)) {
			this.wait();
		}
		sor.add(s);
		Thread curr = Thread.currentThread();
		System.out.println("(Put) Current thread: " +curr.getId());
		this.notifyAll();
	}
	
	synchronized public String get() throws InterruptedException {
		String ret = "";
		while(sor.isEmpty()) {
			this.wait();
		}
		ret = sor.removeFirst();
		this.notifyAll();
		Thread curr = Thread.currentThread();
		System.out.println("(Get) Current thread: " +curr.getId());
		return ret;
		
	}
}
