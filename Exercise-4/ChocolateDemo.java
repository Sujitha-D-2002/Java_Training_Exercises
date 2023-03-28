import java.util.Scanner;
/*
 * Factory Pattern
 */

class UnavailableChocolateException extends Exception {
	/*
	 * In UnavailableChocolateException thrown exception when the user enters the
	 * unavailable chocolate in the factory.
	 */
	public UnavailableChocolateException(String s) {
		super(s);
	}
}

class ChocolateFactory {
	/**
	 * 
	 * Here the chocolate get created for the consumer need
	 */
	public Chocolate createChocolate(String choco) {
		Chocolate chocolate = null;
		try {
			if (choco.equalsIgnoreCase("diarymilk")) {
				chocolate = new DiaryMilk();
			} else if (choco.equalsIgnoreCase("kitkat")) {
				chocolate = new KitKat();
			} else if (choco.equalsIgnoreCase("milkybar")) {
				chocolate = new MilkyBar();
			} else {
				throw new UnavailableChocolateException("Customer need chocolate is unavailable..");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return chocolate;
	}
}

interface Chocolate {
	public void createChocolate();
}

class DiaryMilk implements Chocolate {

	@Override
	public void createChocolate() {
		System.out.println("DiaryMilk get created...!!!");
	}

}

class KitKat implements Chocolate {

	@Override
	public void createChocolate() {
		System.out.println("KitKat get created...!!!");
	}

}

class MilkyBar implements Chocolate {

	@Override
	public void createChocolate() {
		System.out.println("MilkyBar get created...!!!");
	}

}

class ChocolateShop {
	/**
	 * creates chocolate by calling chocolate factory without showing the chocolate
	 * created process to the consumer
	 */
	ChocolateFactory factory;

	public ChocolateShop(ChocolateFactory factory) {
		this.factory = factory;
	}

	public Chocolate orderChocolate(String choco) {
		Chocolate chocolate;
		chocolate = factory.createChocolate(choco);
		return chocolate;
	}

}

class ChocolateDemo {
	/**
	 * Chocolate Demo class get user needed chocolate
	 */
	public static void main(String[] args) {
		ChocolateShop cshop = new ChocolateShop(new ChocolateFactory());
		System.out.println("What chocolate you need....?");
		Scanner sc = new Scanner(System.in);
		String chocolate = sc.next();
		if (cshop.orderChocolate(chocolate) != null) {
			cshop.orderChocolate(chocolate).createChocolate();
		}

		sc.close();
	}
}
