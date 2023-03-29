import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Printing the no of word in the given string
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		System.out.println(arr.length);
		sc.close();
	}

}
