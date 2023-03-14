class Singleton{
	static Singleton s=null;
	private Singleton() {
		System.out.println("Singleton Constructor");
	}
	public static Singleton getInstance() {
		if(s==null) {
			s=new Singleton();
		}
		return s;
	}
}
public class CreateSingleton {

	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.print(s1+" "+s2);//Uses common memory for all object created
	}

}
