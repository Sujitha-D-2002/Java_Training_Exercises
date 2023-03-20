/**
 * 
 * @author sujithadhamotharan
 *
 */
public class Sample2 {
	/**
	 * Here throwing exception and trying how it execute when system.exit(0) is used
	 * in Sample2 class.
	 */
	public void mth1() {
		mth2();
		System.out.println("Caller");
	}

	public void mth2() {
		try {
			int arr[] = new int[3];
			arr[2] = 3;
			System.exit(124);
		} catch (Exception e) {
			System.out.println("Catch-mth2");
		} finally {
			System.out.println("Finally-mth2");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 s = new Sample2();

		s.mth1();
	}

}
