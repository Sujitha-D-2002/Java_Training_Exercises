class BaseClass{
	BaseClass() throws Exception{
		System.out.println("");
		throw new Exception("Exception from base class .....");
	}
}
class DerivedClass extends BaseClass{
	DerivedClass() throws Exception{
		try{
			//super();
		}
		catch(Exception e){
			System.out.println("Exception   "+e);
		}
	}
}
public class ExceptionSample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BaseClass base=new DerivedClass();

	}

}
