/**
 * 
 * @author sujithadhamotharan
 *
 */
/*
 * Here trying to throw error in baseclass constructor and catch constructor it
 * in derived class using try catch but it throws exception because super
 * keyword should be in 1st line of constructor
 */
class BaseClass {
	BaseClass() throws Exception {
		throw new Exception("Exception from base class .....");
	}
}

class DerivedClass extends BaseClass {
	DerivedClass() throws Exception {
		try {
			// super();
		} catch (Exception e) {
			System.out.println("Exception   " + e);
		}
	}
}

public class ExceptionSample {

	public static void main(String[] args) throws Exception {
		BaseClass base = new DerivedClass();

	}

}
