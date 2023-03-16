import java.util.Scanner;

public class AverageMark {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int sum=0;
		boolean flag1=true;
		
		String mark[]= new String[10];
		System.out.println("Enter the Marks");
		for(int i=0;i<10;i++) {
			System.out.println("Mark of Student "+i);
			mark[i]=sc.next();
			try {
				int n=Integer.parseInt(mark[i]);
				sum+=n;
			}
			catch(NumberFormatException e) {
				System.out.println("Please enter a numerical value... " +"\n"+e);
				i--;
			}
		}
		System.out.println("Average mark "+sum/mark.length);
	}

}
