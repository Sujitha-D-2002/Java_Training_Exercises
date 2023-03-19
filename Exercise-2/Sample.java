/**
 * 
 * @author sujithadhamotharan
 *
 */
public class Sample {
	/**
	 * Here throwing exception and trying how it execute when return is used in
	 * Sample class.
	 */
	public void mth1() {
		mth2();
		System.out.println("Caller");
	}

	public void mth2() {
		try {
			int arr[] = new int[3];
			arr[5] = 1;
			return;
		} catch (Exception e) {
			System.out.println("Catch-mth2");
		} finally {
			System.out.println("Finally-mth2");
		}
	}

	public static void main(String[] args) {
		Sample s = new Sample();

		s.mth1();
	}

}
