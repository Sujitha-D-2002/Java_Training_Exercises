import java.util.Scanner;

public class CheckNumber {
	static int palindrome(int n) {
		int rev=0,dig,temp=n,count=0;
		while(n!=0) {
			dig=n%10;
			rev=rev*10+dig;
			n=n/10;
			count++;
		}
		n=temp;
		if(temp==rev) {
			System.out.println("The Given number is palindrome");
		}
		else {
			System.out.println("The Given number is not a palindrome");
		}
		return count;
	}
	static void armstrong(int n,int count) {
		int rev=0,dig=0,temp=n;
		while(n!=0) {
			dig=n%10;
			rev+=Math.pow(dig, count);
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("The Given number is armstrong Number");
		}
		else {
			System.out.println("The Given number is not a armstrong Number");
		}
	}
	static void perfect(int n) {
		int sum=0;
		for(int i = 1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum + i;
            }
        }
        if(sum==n)
        {
            System.out.println("The Given number is a perfect number");
        }
        else
        {
            System.out.println("The Given number is not a perfect number");
        }    
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int count=palindrome(n);
		armstrong(n,count);
		perfect(n);
		sc.close();

	}

}
