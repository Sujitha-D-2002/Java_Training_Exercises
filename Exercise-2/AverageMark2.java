import java.util.Scanner;
class MarkValidateException extends Exception{
	public MarkValidateException(String s)
    {
        super(s);
    }
}
public class AverageMark2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int sum=0;
			boolean flag1=true;
			
			String mark[]= new String[10];
			System.out.println("Enter the Marks");
			for(int i=0;i<10;i++) {
				mark[i]=sc.next();
				try {
						for(int j=0;j<mark[i].length();j++) {
							if(Character.isDigit(mark[i].charAt(j))) {	
								
							}
							
						if(flag1==true) {
							int n=Integer.parseInt(mark[i]);
							if(n<=0 || n>100) {
								throw new MarkValidateException("Mark should be below 100 and non-negative values");
							}
							sum+=n;
						}
					}
				}
				catch(NumberFormatException e) {
					System.out.println("Please enter a numerical value... " +"\n"+e);
					i--;
				}
				catch(MarkValidateException e) {
					System.out.println(e.getMessage());
					i--;
				}
			}
			if(flag1==true) {
				System.out.println("Average mark "+sum/mark.length);
			}
		}
}
