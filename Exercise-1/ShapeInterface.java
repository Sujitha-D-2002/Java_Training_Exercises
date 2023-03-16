import java.util.Scanner;

interface CalcArea{
	final double pi=3.14;
	public double area();
	public double perimeter();
}


interface CalcVolume{
	public double surfaceArea();
	public double volume();
}

class Circle implements CalcArea{
	double r;
	Circle(double r){
		this.r=r;
	}
	public double area() {
		return pi*r*r;
	}

	@Override
	public double perimeter() {
		return 2*pi*r;
	}
	
}
class Square implements CalcArea{
	double a;
	Square(double a){
		this.a=a;
	}
	@Override
	public double area() {
		return a*a;
	}

	@Override
	public double perimeter() {
		return 4*a;
	}
	
}
class Traingle implements CalcArea{
	double a,b,c;

	Traingle(double a,double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public double area() {
		return (a+b+c)/2;
	}

	@Override
	public double perimeter() {
		return a+b+c;
	}
	
}

class Cuboid implements CalcArea,CalcVolume{
	double r;
	Cuboid(double r){
		this.r=r;
	}
	@Override
	public double surfaceArea() {
		return 4*pi*r*r;
	}

	@Override
	public double volume() {
		return (4/3)*pi*r*r*r;
	}
	public double area() {
		return pi*r*r;
	}

	@Override
	public double perimeter() {
		return 2*pi*r;
	}
	
	
}

class Sphere implements CalcArea,CalcVolume{
	double a;
	Sphere(double a){
		this.a=a;
	}
	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 6*a*a;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return a*a*a;
	}
	@Override
	public double area() {
		return a*a;
	}

	@Override
	public double perimeter() {
		return 4*a;
	}
	
}
public class ShapeInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius");
		double radius=sc.nextDouble();
		
		System.out.println("Enter the size");
		double size=sc.nextDouble();
		
		System.out.println("Enter the three sides of traingle");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		//CalcArea Interface
		Circle circle=new Circle(radius);
		System.out.println("Area of Circle "+circle.area());
		System.out.println("Perimeter of Circle "+circle.perimeter());
		
		Traingle traingle=new Traingle(a,b,c);
		System.out.println("Area of Traingle "+traingle.area());
		System.out.println("Perimeter of Traingle "+traingle.perimeter());
		
		Square square=new Square(size);
		System.out.println("Area of Square "+square.area());
		System.out.println("Perimeter of Square "+square.perimeter());
		
		//CalcVolume Interface
		Cuboid cube=new Cuboid(radius);
		System.out.println("Surface Area of Cuboid "+cube.surfaceArea());
		System.out.println("Volume of Cuboid "+cube.volume());
		System.out.println("Area of Cuboid "+cube.area());
		System.out.println("Perimeter of Cuboid "+cube.perimeter());
		
		Sphere sphere=new Sphere(size);
		System.out.println("Surface Area of Sphere "+sphere.surfaceArea());
		System.out.println("Volume of Sphere "+sphere.volume());
		System.out.println("Area of Sphere "+sphere.area());
		System.out.println("Perimeter of Sphere "+sphere.perimeter());
		sc.close();
	}

}

