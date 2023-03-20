import java.util.Scanner;

public class PrimeNumbers {
	/*
	 * Primenumber class prints the prime number
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int flag = 0;
		System.out.println("Prime Numbers are");
		for (int j = 2; j < n; j++) {
			flag = 0;
			divNumber:

			for (int i = 2; i <= j / 2; i++) {
				if (j % i == 0) {
					flag = 1;
					break divNumber;
				}
			}
			if (flag == 0) {
				System.out.print(j + " ");
			}
		}

		sc.close();

	}

}
