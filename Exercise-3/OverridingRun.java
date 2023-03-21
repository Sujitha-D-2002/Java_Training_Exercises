public class OverridingRun extends Thread {
	/**
	 * In OverridingRun class making it as extend thread class and here trying to
	 * override the run method in thread class by printing character 100 times which
	 * is stored in StringBuffer class by using the object lock to print same 100
	 * characters by calling next thread run method print next character 100 times.
	 */
	StringBuffer str;
	static int k = 0;

	OverridingRun(StringBuffer str) {
		this.str = str;
	}

	public void run() {

		synchronized (str) {
			for (int i = 0; i < 100; i++) {
				System.out.print(str.charAt(k));
			}
			System.out.println();
			char ch = (char) ((str.toString()).charAt(k++) + 1);
			str.append(String.valueOf(ch));
		}

	}

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("A");
		new OverridingRun(str).start();
		new OverridingRun(str).start();
		new OverridingRun(str).start();

	}

}
