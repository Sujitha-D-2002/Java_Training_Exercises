class Singleton {
	/*
	 * Singleton class we can only create one object and make use of same memory for
	 * n times of object creation
	 * 
	 */
	static Singleton s = null;

	private Singleton() {
		System.out.println("Singleton Constructor");
	}

	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}
}

public class CreateSingleton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.print(s1 + " " + s2);// it shows same memory address
	}

}
