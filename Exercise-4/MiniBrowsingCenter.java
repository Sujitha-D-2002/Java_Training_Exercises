/*
 * Singleton Pattern
 */
class Printer {
	/**
	 * Printer Class trying to create a Printer for printing 100 pages we won't
	 * create 100 printer we use one printer for printing if another person try to
	 * print means we use same printer rather than creating new printer to acheive
	 * that we can use singleton class.
	 */
	static Printer p = null;

	private Printer() {
		System.out.println("Printer get Created and Connected to PC...");
	}

	public static Printer createPrinter() {
		if (p == null) {
			p = new Printer();
		}
		return p;
	}

	synchronized public void printingContent() {
		System.out.println("Printing content...");
	}
}

public class MiniBrowsingCenter {
	/**
	 * In MiniBrowsingCenter class a person trying to print some pages
	 */
	public static void person() {
		System.out.println("Trying to print 100 pages");

		Printer p1 = Printer.createPrinter();
		p1.printingContent();

		System.out.println("Trying to print another 100 pages");

		Printer p2 = Printer.createPrinter();
		p1.printingContent();

	}

	public static void main(String[] args) {

		MiniBrowsingCenter.person();
	}

}
