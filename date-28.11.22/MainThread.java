package thread;

import java.util.ArrayList;


class LoaderThread implements Runnable {
	int startNumber, lastNumber;
	LoaderThread(int sn, int ln){
		this.startNumber = sn;
		this.startNumber = ln;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ArrayList<Integer> L1 = new ArrayList<Integer>();
		
		for(int i = startNumber; i<lastNumber; i++) {
			L1.add(i);
		}
		for(int j : L1) {
			System.out.println(j);
		}
	}
	
}
public class MainThread {
public static void main(String[] args)throws InterruptedException {
	Runnable r1 = new LoaderThread(0,50);
	Runnable r2 = new LoaderThread(50,100);
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	
	long first, end;
	// for 0 to 50
	first = System.currentTimeMillis();
	System.out.println("respons time taken befor executing: "+ first);
	t1.start();
	t1.join();
	
	end = System.currentTimeMillis();
	System.out.println("response time taken after executing  "+ end);
	System.out.println("response time : "+(end - first));
	// for 50 to 100
	first = System.currentTimeMillis();
	System.out.println("respons time taken befor executing: "+ first);
	t2.start();
	t2.join();
	
	end = System.currentTimeMillis();
	System.out.println("response time taken after executing  "+ end);
	System.out.println("response time : "+(end - first));
}
}
