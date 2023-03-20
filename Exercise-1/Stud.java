import java.util.Scanner;

class Student {
	/*
	 * In student class creating name and rollno as instance variable
	 */
	String name;
	int rollNo;
}

class Exam extends Student {
	/*
	 * In Exam class which extends student Class creating mark1,mark2,mark3 as
	 * instance variable
	 */
	int mark1, mark2, mark3;

}

class Result extends Exam {
	int total;

	/*
	 * In Result class which extends exam class using the marks (instance variable)
	 * trying to calculate the result
	 */
	public void calculateResult() {
		total = mark1 + mark2 + mark3;
		System.out.println("Total Mark => " + name + " " + total);
	}

}

public class Stud {
	/**
	 * Stud class get the details of student and the mark and passing it ro
	 * calculateResult class
	 */
	public static void main(String[] args) {
		Result result = new Result();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the name");
		result.name = scanner.nextLine();

		System.out.println("Enter the Roll no");
		result.rollNo = scanner.nextInt();

		System.out.println("Enter the mark of sub 1");
		result.mark1 = scanner.nextInt();

		System.out.println("Enter the mark of sub 2");
		result.mark2 = scanner.nextInt();

		System.out.println("Enter the mark of sub 3");
		result.mark3 = scanner.nextInt();

		result.calculateResult();
		scanner.close();
	}

}
