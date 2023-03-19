import java.util.Scanner;
/**
 * 
 * @author sujithadhamotharan
 *
 */
public class ArithmeticException1 {
/**
 * 
 * @param args
 * Here it checks for NumberFormatException if it throws exception then it check for Alphabet Q or q it get exit
 * if it throws any other Exception it throws Poor input data mesaage
 * 
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag=0;
		while(flag!=1) {
			System.out.println("Enter the numerator and denominator:");

			String numerator=sc.next();
			int denominator=sc.nextInt();
				try {
					System.out.println("Output "+(Integer.parseInt(numerator)/denominator));
				}
				catch(NumberFormatException e) {
					if(numerator.charAt(0)=='Q'||numerator.charAt(0)=='q') {
						System.exit(0);
				    }
					else {
						System.out.println("Poor input Data");
					}
					
				}
				catch(Exception e){
					System.out.println(e);
				}
		}
		sc.close();
		
	}

}
