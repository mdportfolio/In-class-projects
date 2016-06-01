/* Marciana Davis 
 * CSCI 185 M01
 * Programming Assignment 1 
 * Date of Successful Debugging: October 6, 2015
*/
package hw1davism;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(3, 2.5, 4);
		triangle.setColor("yellow");
		triangle.setFilled(true);
		System.out.println(triangle);
		System.out.println("The area is " + triangle.getArea());
		System.out.println("The perimeter is " + triangle.getPerimeter());
		System.out.println(triangle);
	}
}
