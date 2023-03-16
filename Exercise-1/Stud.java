import java.util.Scanner;

class Student{
	String name;
	int rollno;	 
}
class Exam extends Student{
	int mark1,mark2,mark3;
	
}
class Result extends Exam{
	int totalmark;
	public void calculateResult() {
		totalmark=mark1+mark2+mark3;
		System.out.println("Total Mark => "+name+" "+totalmark);
	}
	
}

public class Stud {

	public static void main(String[] args) {
		Result s1 = new Result();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		s1.name = sc.nextLine();
		
		System.out.println("Enter the Roll no");
		s1.rollno = sc.nextInt();
		
		System.out.println("Enter the mark of sub 1");
		s1.mark1 = sc.nextInt();
		
		System.out.println("Enter the mark of sub 2");
		s1.mark2 = sc.nextInt();
		
		System.out.println("Enter the mark of sub 3");
		s1.mark3 = sc.nextInt();
		
		s1.calculateResult();
		sc.close();
	}

}
