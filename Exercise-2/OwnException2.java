import java.util.Scanner;

class MarkValidationException extends Exception{
	/*
	 * In MarkValidationException i have thrown exception while checking if mark is
	 * entered as greater than 100 without catch block
	 */
	public MarkValidationException(String s)
    {
        super(s);
    }
}
class OwnExceptionClass{
	public void validateMark(int arr[]) throws MarkValidationException {
		try {
			for(int i=0;i<5;i++) {
				if(arr[i]<=0 || arr[i]>100) {
					throw new MarkValidationException("Mark should be below 100 and non-negative values");
				}
			}
		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		finally{
			System.out.println("There is an Error in the mark list");
		}
	}
}
public class OwnException2 {
	public static void main(String[] args) throws MarkValidationException {
		// TODO Auto-generated method stub
		String str=null;
		Scanner sc=new Scanner(System.in);
		int mark[]= new int[5];
		System.out.println("Enter the Marks");
		for(int i=0;i<5;i++) {
			mark[i]=sc.nextInt();
		}
		OwnExceptionClass own=new OwnExceptionClass();
		own.validateMark(mark);
		sc.close();
	}
}
