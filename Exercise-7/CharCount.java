import java.util.Scanner;

public class CharCount {
	/**
	 * Printing the count of character given
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			char ch = sc.next().charAt(0);
			if (sc.next() == null)
				break;
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
