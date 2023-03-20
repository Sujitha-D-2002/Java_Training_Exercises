import java.util.Scanner;

public class AverageMark {
	/*
	 * In AverageMark class it throw exception while checking if mark is entered as
	 * String or any other datatype rather then number and after getting 10 marks it
	 * calculate the average
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		String mark[] = new String[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the Mark of Student " + (i + 1));
			int j = 0;
			mark[i] = sc.next();
			try {
				if ((mark[i].charAt(0) == '-')) {
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
				sum += n;
			} catch (NumberFormatException e) {
				System.out.println("Please enter a numerical value... " + "\n" + e);
			}
		}
		System.out.println("Average mark " + sum / mark.length);
		sc.close();
	}

}
