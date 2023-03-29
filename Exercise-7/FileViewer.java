import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileViewer {
	public static void main(String args[]) {
		try {
			FileInputStream fileInputStream = new FileInputStream("file1.txt");
			BufferedInputStream bufferInputStream = new BufferedInputStream(fileInputStream );
			int i;
			// Read the content of file using bufferedInputStream and printing the content
			while ((i = bufferInputStream.read()) != -1) {
				System.out.print((char) i);
			}
			bufferInputStream.close();
			fileInputStream .close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}