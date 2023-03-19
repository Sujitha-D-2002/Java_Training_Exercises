import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class SynchronizedAccess {
	/**
	 * SynchronizedAccess class explains how synchronized keyword work by creating
	 * multiple thread it works with one thread at a time.
	 */
	public SynchronizedAccess() {
		ExecutorService es = Executors.newFixedThreadPool(3);
		/**
		 * Creating First Thread
		 */
		es.execute(() -> {
			multiThread1();
		});
		/**
		 * Creating Second Thread
		 */
		es.execute(() -> {
			multiThread2();
		});
		/**
		 * Creating Third Thread
		 */
		es.execute(() -> {
			multiThread3();
		});

		es.shutdown();
	}

	// using synchronized in method to call one thread at a time
	synchronized public void multiThread1() {
		System.out.print("[----");
	}

	synchronized public void multiThread2() {
		System.out.print("Message");
	}

	synchronized public void multiThread3() {
		System.out.print("----]");
	}

	public static void main(String[] args) {
		new SynchronizedAccess();
	}

}
