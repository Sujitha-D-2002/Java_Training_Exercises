import java.util.Scanner;
/**
 * 
 * @author sujithadhamotharan
 *
 */
class MarkValidateException extends Exception {
	/*
	 * In MarkValidationException i have thrown exception while checking if mark is
	 * entered as String or any other datatype rather then number and also check for mark greater than 100 
	 */
	public MarkValidateException(String s) {
		super(s);
	}
}

public class AverageMark2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		boolean flag = true;

		String mark[] = new String[10];
		System.out.println("Enter the Marks");
		int i = 0;
		while (i < 10) {
			int j=0;
			mark[i] = sc.next();
			try {
				if( (mark[i].charAt(0)=='-')) {
					j++;
				}
				while (j < mark[i].length()) {
					if (!Character.isDigit(mark[i].charAt(j))) {
						i--;
						throw new NumberFormatException();
					}
					j++;
				}

				int n = Integer.parseInt(mark[i]);
				if (n <= 0 || n > 100) {
					i--;
					throw new MarkValidateException("Mark should be below 100 and non-negative values");
				}
				sum += n;

			} catch (NumberFormatException e) {
				System.out.println("Please enter a numerical value... " + "\n" + e);
			} catch (MarkValidateException e) {
				System.out.println(e.getMessage());
			}
			i++;
		}
		if (flag == true) {
			System.out.println("Average mark " + sum / mark.length);
		}
		sc.close();
	}
}
