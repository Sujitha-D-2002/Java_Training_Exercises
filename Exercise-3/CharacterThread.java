import java.util.Scanner;

class nonAlphabeticCharacterException extends Exception {
	/**
	 * nonAlphabeticCharacterException class throws an excepton when user enters the
	 * non alphabetic character
	 */
	nonAlphabeticCharacterException() {
		super();
	}
}

class CharacterClass {
	/**
	 * In CharacterClass here characters are passed from thread and it checks for
	 * the character is alphabetic or not. If it is not an alphabetic it throws an
	 * exception
	 * 
	 */
	public static void characterClass(Character ch) {
		try {
			if (!Character.isAlphabetic(ch)) {
				throw new Exception("Non-alphabetic character");
			} else {
				System.out.println(ch);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class CharacterThread {
	/**
	 * In CharacterThread class by creating a new thread and within that we have run
	 * as default method constructed using Runnable object in that method trying to
	 * pass the string as character and check for the character in CharacterClass
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			char ch = sc.next().charAt(0);
			new Thread(new Runnable() {

				@Override
				public void run() {
					CharacterClass.characterClass(ch);
				}
			}).start();
		}

	}

}
