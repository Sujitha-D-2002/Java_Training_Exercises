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
	C(){
		System.out.println("C class Constructor...");
	}
	public void cMethod() {
		B b_class=new B();
		b_class.bvar=10;
		System.out.println("B value in C Class");
	}
}
public class ObserveResult {

	public static void main(String[] args) {
		C c_class=new C();
		c_class.cMethod();

	}

}
