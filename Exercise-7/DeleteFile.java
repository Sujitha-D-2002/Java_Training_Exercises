
import java.io.*;

public class DeleteFile {
	/*
	 * Trying to delete the file
	 */
	public static void main(String[] args)
	{
		File file= new File("file2.txt");

		if (file.delete()) {
			System.out.println("File Deleted Successfully..!!");
		}
		else {
			System.out.println("Not Deleted");
		}
	}
}
