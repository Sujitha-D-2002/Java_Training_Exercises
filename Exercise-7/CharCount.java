import java.util.Scanner;

public class CharCount {
	 //Count of character given
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		boolean flag=true;
		System.out.println("Enter the character");
		while (flag) {
			char ch = scanner.next().charAt(0);
			if (!Character.isAlphabetic(ch)) {
				flag=false;
				count--;
			}
			count++;
		}
		System.out.println("Count of Character: "+count);
		scanner.close();
	}

}
