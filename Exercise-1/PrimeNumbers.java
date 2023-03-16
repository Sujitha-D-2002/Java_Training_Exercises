import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int flag=0;
		System.out.println("Prime Numbers are");
		for(int j=2;j<n;j++) {
			//Flag:
			flag=0;
			for(int i=2;i<=j/2;i++) {
				if(j%i==0) {
				 //break Flag;
					flag=1;
				}
			}
			if(flag==0) {
				System.out.print(j+" ");
			}
		}
		
		sc.close();

	}

}
