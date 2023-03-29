import java.io.FileReader;
import java.io.FileWriter;

public class CopyChar {
	public static void main(String[] args) throws Exception {
		FileReader fileReader = new FileReader("data.txt");
		// Read the content from file data.txt character by character
		try (FileWriter fileWriter = new FileWriter("copydata.txt")) {
			char c[] = new char[8];
			int i = 0;
			while ((i = fileReader.read(c)) != -1) {
				String s = new String(c, 0, i);
				System.out.println(s);
				fileWriter.write(s);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}