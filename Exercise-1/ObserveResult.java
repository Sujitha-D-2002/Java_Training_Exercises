class A{
	A(){
		System.out.println("A class Constructor...");
	}
}
class B{
	int bvar;
	B(){
		System.out.println("B class Constructor...");
	}
}
class C extends A{
	B b_class=new B();
}
public class ObserveResult {

	public static void main(String[] args) {
		C c_class=new C();

	}

}
