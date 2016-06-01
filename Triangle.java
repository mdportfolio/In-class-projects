package hw1davism;
public class Triangle extends GeometricObject {
		private double side1 = 1.0;
	    private	double side2 = 1.0;
		private double side3 = 1.0;
public Triangle(){ /*default constructor */ } 		
public Triangle(double side1, double side2, double side3){  // constructor with specified sides
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
}
public double getSide1(){ // the getter for the side 1
	return side1;
}
public double getSide2(){ // the getter for the side 2
	return side2;
}
public double getSide3(){ // the getter for the side 3
	return side3;
}	
public double getArea(){  // getting the area	
	double s = (side1 + side2 + side3)/2;
	double a = Math.sqrt(s *(s - side1)*(s - side2)*(s - side3));
	return a;
}
public double getPerimeter(){  //getting the perimeter
	double p = side1 + side2 + side3;
	return p;
}
public String toString(){  // string representation of the triangle
	return "Triangle: side 1 =" + side1 + "side 2 =" + side2 + "side 3 ="+ side3;
}
}