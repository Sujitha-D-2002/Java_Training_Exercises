import java.util.Scanner;

public class ArithmeticException1 {

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
		
	}

}
