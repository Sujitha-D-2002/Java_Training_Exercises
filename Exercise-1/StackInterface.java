import java.util.Arrays;
import java.util.Scanner;

interface Stack{
	public void push(int val);
	public void pop();
}
class FixedClass implements Stack{
	int n;
	int top=-1;
    int[] arr;
	FixedClass(int n){
		this.n=n;
		this.arr=new int[n];
		System.out.println("Fixed Class");
	}
	
	@Override
	
	public void push(int val) {
		// TODO Auto-generated method stub
		top++;
		if(top<n) {
			arr[top]=val;
		}
		else {
			System.out.println("Stack Overflow");
		}
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		top--;
		if(top>=0) {
			System.out.println("After Pop Method in Fixed Class");
			for(int i=0;i<=top;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		else {
			System.out.println("Stack Underflow");
		}
	}
	
}
class DynamicClass implements Stack{
	int n;
	int top=-1;
    int[] arr;
	DynamicClass(int n){
		this.n=n;
		this.arr=new int[n];
		System.out.println("Fixed Class");
	}
	@Override
	public void push(int val) {
		// TODO Auto-generated method stub
		top++;
		if(top<n) {
			arr[top]=val;
		}
		else {
			arr=Arrays.copyOf(arr, n=n*2);
			arr[top]=val;
			System.out.println(n);
		}
		
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		top--;
		if(top>=0) {
			System.out.println("After Pop Method in Fixed Class");
			for(int i=0;i<=top;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		else {
			System.out.println("Stack Underflow");
		}
		
	}
	
}
public class StackInterface {
	
	public static void stackFunc(Stack stack) {
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		while(flag) {
			System.out.println("Select the option\n1.Push\n2.Pop\n3.Exit");
			int n=sc.nextInt();
			switch(n) {
				case 1:
					System.out.println("Enter the value to push");
					int val=sc.nextInt();
					stack.push(val);
					break;
				case 2:
					stack.pop();
					break;
				case 3:
					flag=false;
					break;
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the stack type:\n1.Fixed Stack\n2.Dynamic Stack");
		int option=sc.nextInt();
		System.out.println("Enter the size of stack");
		int size=sc.nextInt();
		switch(option) {
		case 1:
			FixedClass f=new FixedClass(size);
			stackFunc(f);
			break;
		case 2:
			DynamicClass d=new DynamicClass(size);
			stackFunc(d);
		}	
		sc.close();
		
	}

}
