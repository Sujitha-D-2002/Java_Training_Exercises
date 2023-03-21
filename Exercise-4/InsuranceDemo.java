/**
 * Visitor Pattern
 *
 */
interface BuildingType {
	String getName();

	String visit(BuildingTypeVisitor visitor);
}

/**
 * Here In Bank class and Shops class there is no need to modify the class.
 * Becoz the insurance is written in separacte class If we want to modify the
 * insurance we can modify it in SellInsuranceVisitor Class
 *
 */
class Bank implements BuildingType {
	@Override
	public String getName() {
		return "Bank";
	}

	@Override
	/*
	 * Here if bank need to visit for insurance they can claim the theft insurance
	 */
	public String visit(BuildingTypeVisitor visitor) {
		return visitor.visit(this);
	}
}

class Shops implements BuildingType {

	@Override
	public String getName() {
		return "Shops";
	}

	@Override
	/*
	 * Here if shops need to visit for insurance they can claim the fire and flood
	 * insurance
	 */
	public String visit(BuildingTypeVisitor visitor) {
		return visitor.visit(this);
	}
}

public class InsuranceDemo {
	public static void main(String[] args) {
		BuildingTypeVisitor insurance = new SellInsuranceVisitor();

		BuildingType bank = new Bank();
		System.out.println("Building type: " + bank.getName());
		System.out.println(bank.visit(insurance));

		BuildingType shop = new Shops();
		System.out.println("\nBuilding type: " + shop.getName());
		System.out.println(shop.visit(insurance));
	}

}

interface BuildingTypeVisitor {
	String visit(Shops shop);

	String visit(Bank bank);
}

/*
 * Here in SellInsuranceVisitor class the insurance will given according to the
 * building type
 */
class SellInsuranceVisitor implements BuildingTypeVisitor {

	@Override
	public String visit(Shops shop) {
		return "Flood and Fire Insurance..!!";
	}

	@Override
	public String visit(Bank bank) {
		return "Theft Insurance..!!";
	}
}