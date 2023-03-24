import java.io.*;
import java.util.Date;

public class WriteDateObject {
	public static void main(String[] args) {
		/**
		 * Trying to write date Object in file and trying to read the content or object
		 * written in file
		 */
		try {
			Date date = new Date();
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("dateobject.txt"));
			output.writeObject(date);
			output.close();

			ObjectInputStream input = new ObjectInputStream(new FileInputStream("dateobject.txt"));
			Date dateFile = (Date) input.readObject();
			input.close();

			System.out.println("Original date: " + date);
			System.out.println("Date read from file: " + dateFile);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
