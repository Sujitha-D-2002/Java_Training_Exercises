import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CopyLine {

	public static void main(String[] args) {
		BufferedReader reader;
		/**
		 * Trying to print line by line from the file using bufferreader
		 */
		try {
			reader = new BufferedReader(new FileReader("sample.txt"));
			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
