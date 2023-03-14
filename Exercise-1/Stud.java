import java.util.Scanner;

class Student{
	String name;
	int rollno;	 
}
class Exam extends Student{
	int mark_1,mark_2,mark_3;
	
}
class Result extends Exam{
	int totalmark;
	public void calculateTotalMark() {
		totalmark=mark_1+mark_2+mark_3;
		System.out.println("Total Mark => "+name+" "+totalmark);
	}
	
}
public class Stud {

	public static void main(String[] args) {
		Result s1=new Result();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		s1.name=name;
		System.out.println("Enter the Roll no");
		int rollno=sc.nextInt();
		s1.rollno=rollno;
		System.out.println("Enter the mark of sub 1");
		int m1=sc.nextInt();
		s1.mark_1=m1;
		System.out.println("Enter the mark of sub 2");
		int m2=sc.nextInt();
		s1.mark_2=m2;
		System.out.println("Enter the mark of sub 3");
		int m3=sc.nextInt();
		s1.mark_3=m3;
		s1.calculateTotalMark();
		sc.close();
	}

}
