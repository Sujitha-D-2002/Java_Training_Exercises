import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileViewer {
	public static void main(String args[]) {
		try {
			FileInputStream file = new FileInputStream("file1.txt");
			BufferedInputStream buffer = new BufferedInputStream(file);
			int i;
			/**
			 * Here trying to read the content of file1.text using buffered input stream and
			 * printing the content
			 */
			while ((i = buffer.read()) != -1) {
				System.out.print((char) i);
			}
			buffer.close();
			file.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}