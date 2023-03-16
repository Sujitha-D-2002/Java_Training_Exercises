
public class Sample2 {
	public void mth1() {
		mth2();
		System.out.println("Caller");
	}

	public void mth2() {
		try {
			int arr[] = new int[3];
			arr[2] = 4;
			System.exit(0);
		} catch (Exception e) {
			System.out.println("Catch-mth2");
		} finally {
			System.out.println("Finally-mth2");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample_2 s = new Sample_2();

		s.mth1();
	}

}
