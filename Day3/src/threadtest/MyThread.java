package threadtest;
public class MyThread extends Thread{

	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try{
			for(int i = 0; i<8; i++){
				System.out.println(this.getName()+" says "+i+ ". Alive: "+ this.isAlive());
				Thread.sleep(2000);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
