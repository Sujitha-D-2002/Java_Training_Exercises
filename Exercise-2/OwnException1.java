import java.util.Scanner;

class MarkValidateException extends Exception {
	/*
	 * In MarkValidationException i have thrown exception while checking if mark is
	 * entered as greater than 100 
	 */
	public MarkValidateException(String s) {
		super(s);
	}
}

public class OwnException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mark[] = new int[5];
		System.out.println("Enter the Marks");
		for (int i = 0; i < 5; i++) {
			mark[i] = sc.nextInt();
		}
		try {
			for (int i = 0; i < 5; i++) {
				if (mark[i] <= 0 || mark[i] > 100) {
					throw new MarkValidateException("Mark should be below 100 and non-negative values");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

}
