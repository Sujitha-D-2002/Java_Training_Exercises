import java.io.File;

public class FileSize {
	public static void main(String[] args) {
		//Size of the file
		File file = new File("file1.txt");
		long fileSize = file.length();
		System.out.println(fileSize + " bytes");
	}
}
