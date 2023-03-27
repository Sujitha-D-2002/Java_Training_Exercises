import java.io.File;

public class DirectoryLister {
	public static void main(String[] args) {
		// List the directories by passing path in command line argument
		if (args.length != 1) {
			System.out.println("List Directory");
			System.exit(1);
		}
		File dir = new File(args[0]);
		String[] files = dir.list();
		System.out.println(files);
		for (String file : files) {
			System.out.println("[DIR] " + file);
		}
	}
}