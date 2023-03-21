
import java.text.DateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DigitalClock {
	/**
	 * In DigitalClock Class using Inbuilt Dateformat abstract class trying to get only the time
	 * using getTimeInstance method and to make it as digital clock using
	 * thead.sleep for 1 second it prints continuously because of while loop and act
	 * as digital clock
	 */
	DigitalClock() {
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(() -> {
			try {
				while (true) {
					String str = DateFormat.getTimeInstance().format(new java.util.Date());
					System.out.println(str);
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		});
		es.shutdown();
	}

	public static void main(String[] args) {
		new DigitalClock();
	}

}
