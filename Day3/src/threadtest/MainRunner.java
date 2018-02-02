package threadtest;

public class MainRunner {

	public MainRunner() {
	}

	public static void main(String[] args) {
		Thread t0 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =0; i<10; i++){
					System.out.println(Thread.currentThread().getName()+" says "+i+ ". Alive: "+ Thread.currentThread().isAlive());
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				
			}
		},"Sunya");
		
		MyThread t1 = new MyThread("Pehla");
		t1.setPriority(1);
		MyThread t2 = new MyThread("Doosra");
		t2.setPriority(10);
		MyThread t3 = new MyThread("Teesra");
		t3.setPriority(8);
		
		System.out.println(Thread.currentThread().getName() + " : Main waiting... Alive: " + Thread.currentThread().isAlive());
		System.out.println(t1.getName() + " : Alive : " + t1.isAlive());
		System.out.println(t2.getName() + " : Alive : " + t2.isAlive());
		System.out.println(t3.getName() + " : Alive : " + t2.isAlive());
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread k = Thread.currentThread();
			System.out.println(k.getName() + " : Main waiting... Alive: " + k.isAlive());
			
			t0.join();
			t1.join();
			t2.join();
			t3.join();
			
			System.out.println(t0.getName() + " : Alive : " + t0.isAlive());
			System.out.println(t1.getName() + " : Alive : " + t1.isAlive());
			System.out.println(t2.getName() + " : Alive : " + t2.isAlive());
			System.out.println(t3.getName() + " : Alive : " + t3.isAlive());
			
			System.out.println(k.getName()+" : "+k.isAlive());
	
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
	}

}
