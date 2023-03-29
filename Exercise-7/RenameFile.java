import java.io.File;

public class RenameFile {
	public static void main(String[] args) {
		// Rename File
		File file = new File("Filenamechange.txt");
		File renamedFile = new File("Filenameupdated.txt");
		boolean flag = file.renameTo(renamedFile);
		if (flag == true) {
			System.out.println("File Successfully Renamed..!!");
		} else {
			System.out.println("File is not Renamed");
		}
	}
}
