public class CountingThread {
	/**
	 * In CountingThread Class trying to print 1 to 100 numbers by 1 second delay
	 * using Thread.sleep() and also telling message like 10 numbers get printed
	 * after printing ten numbers each time
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {

			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			if (i % 10 == 0) {
				System.out.println("Ten numbers get printed");
			}

		}
	}

}
