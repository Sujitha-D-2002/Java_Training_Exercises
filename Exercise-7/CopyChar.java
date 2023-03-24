import java.io.FileReader;
import java.io.FileWriter;

public class CopyChar {
	public static void main(String[] args) throws Exception {

		FileReader in = new FileReader("data.txt");
		/**
		 * Trying to read the content from file data.txt character by character
		 */
		try (FileWriter out = new FileWriter("copydata.txt")) {
			char c[] = new char[8];
			int i = 0;
			while ((i = in.read(c)) != -1) {
				String s = new String(c, 0, i);
				System.out.println(s);
				out.write(s);
			}
		} catch (Exception e) {

		}
	}
}