import java.util.HashMap;

/**
 * Flyweight pattern
 *
 */
public class FoodItem {
	/**
	 * Trying to create object for 30 customers according to their needed food
	 */
	public static void main(String[] args) {
		for (int noOfCustomer = 0; noOfCustomer <= 30; noOfCustomer++) {
			Food food = new FoodFactory().getFood(noOfCustomer % 2 == 0 ? "Naan" : "Chappathi");
			food.setSidedish(noOfCustomer % 3 == 0 ? "Paneer Butter Masala" : "Chicken Gravy");

			food.details();
			System.out.println("-----------------------");
		}
	}
}

abstract class Food {
	abstract public void setSidedish(String food);

	abstract public void details();
}

class Naan extends Food {
	final String peopleType;
	String preferedFood = "defaultFood";

	Naan() {
		peopleType = "North Indians";
	}

	@Override
	public void setSidedish(String food) {
		preferedFood = food;

	}

	@Override
	public void details() {
		System.out.println(peopleType + " prefered Side Dish Food is " + preferedFood);
	}

}

class Indian extends Food {
	final String peopleType;
	String preferedFood = "defaultfood";

	Indian() {
		peopleType = "South Indians";
	}

	@Override
	public void setSidedish(String food) {
		preferedFood = food;
	}

	@Override
	public void details() {
		System.out.println(peopleType + " prefered Food is " + preferedFood);
	}
}

class FoodFactory {

	HashMap<String, Food> foodItems = new HashMap<>();

	/**
	 * Here trying to store already created object in hasmap if user try to create
	 * object for similar object n times then it return the object which is created
	 * first time or else it creates if that object is creating for first time.
	 */
	public Food getFood(String type) {

		Food people = null;

		if (foodItems.containsKey(type)) {
			people = foodItems.get(type);
			return people;
		}
		switch (type) {
		case "Naan":
			people = new Naan();
			break;
		case "Chappathi":
			people = new Indian();
			break;
		default:
			System.out.println("Type not available");
		}

		foodItems.put(type, people);

		return people;
	}
}