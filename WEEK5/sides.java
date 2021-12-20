/*  Write a Java program to create an abstract class named Shape that contains an empty method named numberOfSides(). Provide three classes named 
Rectangle, Triangle, and Hexagon such that each one of the classes extends the class Shape. Each one of the classes contains only the method 
numberOfSides()that shows the number of sides in the given geometrical structures.  */


abstract class Shape{
	abstract void numberOfSides();
}

class Rectangle extends Shape{
	void numberOfSides(){
		System.out.println("Number of sides in a rectangle: 4");
	}
}

class Triangle extends Shape{
	void numberOfSides(){
		System.out.println("Number of sides in a triangle: 3");
	}
}

class Hexagon extends Shape{
	void numberOfSides(){
		System.out.println("Number of sides in a hexagon: 6");
	}
}

public class sides{
    public static void main(String args[]) {
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Hexagon h = new Hexagon();
		r.numberOfSides();
		t.numberOfSides();
		h.numberOfSides();
	}
}
