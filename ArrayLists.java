/*
 * Marciana Davis
 * CSCI 185 M01
 * Programming Assignment 5
 * Successful Debugging: December 7, 2015
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class ArrayLists {

	public static void main(String[] args) {
		// Creating a course list
		ArrayList<String>cl = new ArrayList<String>();
		Scanner keyboard = new Scanner("C:\\Users\\Owner\\OneDrive\\Documents\\course.txt");
	    cl.add("Math 180");
	    cl.add("Eng 300");
	    cl.add("CSCI 185");
			
		 // Answer if the course search is there or not
        cl.contains(keyboard);
        if (search.equals(keyboard)){System.out.println("Yes" + cl.contains(keyboard)+ "is on the list."); }
        else System.out.println("Not on the list.");
        
		// Display course list
		System.out.println("The list contains the following courses:");
	    int clistSize = cl.size(); // get the size of the array
	    for (int p = 0; p < clistSize; p++) //
	    System.out.println(cl.get(p));

		// Delete from course list
	    System.out.println("Do you want to remove items?");
		cl.remove(keyboard);
		// Saving it on the text file
		Scanner is = null;
		try{
			is = new Scanner(new File("courselist.txt"));
		}catch(Exception ex){}
		while(is.hasNextLine())
			is.close();
		      
	}
        // Search for a course on list
		public boolean contains(boolean search){
			search = cl.list();
	 	return search;
		}
	// Remove a course
		public int remove(int r, ArrayList<String>c){
			int count = 0;
			while(count < c.size())
				c.size--;
			return r;
		}
}
