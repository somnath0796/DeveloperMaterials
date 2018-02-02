package threadsync;

public class SyncMain {

	public static void main(String[] args) throws InterruptedException {
		Resource res = new Resource();
		Thread t1 = new Thread(new PrintWorker(res, "Hello"));
		Thread t2 = new Thread(new PrintWorker(res, "Good"));
		Thread t3 = new Thread(new PrintWorker(res, "World"));
		t1.setPriority(8);
		t2.setPriority(6);
		t3.setPriority(4);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
	}

}
