import java.io.File;

public class FileSize {
	public static void main(String[] args) {
			File file = new File("file1.txt");

			long fileSize = file.length();

			System.out.println(fileSize + " bytes");
	}
}
