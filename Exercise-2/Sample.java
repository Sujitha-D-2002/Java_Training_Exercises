
public class Sample {
	public void mth1() {
		mth2();
		System.out.println("Caller");
	}
	public void mth2() {
		try {
			int arr[]=new int[3];
			arr[2]=1;
			return;
		}
		catch(Exception e) {
			System.out.println("Catch-mth2");
		}
		finally{
			System.out.println("Finally-mth2");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		
		s.mth1();
	}

}
