import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CopyLine {

	public static void main(String[] args) {
		BufferedReader bufferedReader;
		// Print line by line from the file using BufferReader
		try {
			bufferedReader = new BufferedReader(new FileReader("sample.txt"));
			String line = bufferedReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
