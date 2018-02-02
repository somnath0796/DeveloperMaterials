package threadsync;

public class PrintWorker implements Runnable {
	
	private Resource resource;
	private String message;
	
	public PrintWorker(Resource resource, String message) {
		this.resource = resource;
		this.message = message;
	}

	@Override
	public void run() {
		synchronized (resource) {
			resource.print(message);
		}
	}

}
