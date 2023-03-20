
public class ThreadStart {
	/**
	 * ThreadStart class explains how thread will react when we try to start one
	 * thread more than 1 times.
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
/*
 * Here when once thread get start means new thread class create a functional
 * interface runnable so if we try to again call the same thread it won't start
 * again and create a thread and runnable so we cannot start 2 thread
 */