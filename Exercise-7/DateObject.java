import java.io.*;
import java.util.Date;

public class DateObject {
	public static void main(String[] args) {
		// Write date Object in file and read the content or object written in file
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
