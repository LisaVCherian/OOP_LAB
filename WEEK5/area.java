/* Write a Java program to calculate the area of different shapes namely circle, rectangle and triangle using the concept of 
method overloading. */


class overload
{
	void area(double x, double y){
		System.out.println("Area of rectangle: " + x*y);
	}

	void area(double r){
		System.out.println("Area of circle: " + 3.14*r*r);
	}

	void area(int b, int h){
		System.out.println("Area of triangle: " + 0.5*b*h);
	}
}

public class area{
	public static void main(String args[]){
		overload ob = new overload();
		ob.area(2,5);
		ob.area(2.5);
		ob.area(3.5,2.5);
	}
}
