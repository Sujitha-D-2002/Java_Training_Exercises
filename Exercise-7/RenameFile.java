
import java.io.File;
public class RenameFile {
	public static void main(String[] args)
	{
		File file = new File("Filenamechange.txt");
		File rename = new File("Filenameupdated.txt");

		boolean flag = file.renameTo(rename);

		if (flag == true) {
			System.out.println("File Successfully Renamed..!!");
		}
		else {
			System.out.println("File is not Renamed");
		}
	}
}
