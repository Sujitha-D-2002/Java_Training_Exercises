import java.io.File;
import java.util.Scanner;

class ExceptionClass{
	public void fileAccess() {
		File file=new File("/First.text");
		//try{
			Scanner sc=new Scanner(file);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
	}
}
public class IOException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ExceptionClass e=new ExceptionClass();

		e.fileAccess();
	}

}
