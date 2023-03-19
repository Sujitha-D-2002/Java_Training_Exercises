public class OddEvenNumber {
	/**
	 * In OddEvenNumber class trying to print odd and even numbers using two
	 * thread.But Thread work as mulitple thread work on same time
	 */
	public static void oddNumber() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void evenNumber() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * One thread calling the oddNumber Method
		 */
		new Thread(new Runnable() {

			@Override
			public void run() {
				oddNumber();
			}
		}).start();
		/*
		 * Another One thread calling the evenNumber Method
		 */
		new Thread(new Runnable() {

			@Override
			public void run() {
				evenNumber();
			}
		}).start();

	}

}
