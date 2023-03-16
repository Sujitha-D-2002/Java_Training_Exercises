public class proof {
	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println("Before Pass by Value: "+d.size);
		new Passing().passValue(d.size);
		System.out.println("After Pass By Value: "+d.size);
		
		System.out.println("Before Pass By Reference: "+d.size);
		new Passing().passReference(d);
		System.out.println("After Pass By Reference: "+d.size);

	}
}
class Demo{
	Integer size=10;
}

class Passing{
	public void passValue(int size) {
		size=20;
		System.out.println("Within the local scope: "+size);
	}
	public void passReference(Demo demo) {
		demo.size=30;
	}
}
