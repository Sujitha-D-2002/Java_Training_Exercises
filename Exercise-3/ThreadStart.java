
public class ThreadStart {
	/**
	 * ThreadStart class explains how thread will react when we try to start one
	 * thread more than 1 times
	 */
	public static void threadMethod() {
		System.out.println("Thread Call....");
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				threadMethod();
			}
		});
		t1.start();
		t1.start();

	}

}
