// Find the min., max., avg. of studets grades and the students who grade(s) that are greater than the avg.
package lab2;
import java.util.Scanner;
public class Lab2 {

    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int grades [] = new int [10];
    int s = 0;
    int max = grades[0];
    int min = grades[0];
    double avg;
    System.out.println("Enter your students' grades:");
   
  //Calculating the average
   for(int i = 0; i < grades.length; i++){
     grades[i] = kb.nextInt();
     s = s + grades[i];
      if (grades[i] > max) {
      max = grades[i]; 
   }
    if (grades[i] < min) {
       min = grades[i];
    } 
 }
     avg = s / grades.length;
  
// Finding the number of students above average.                                                                                              
   int results = 0;
   for(int g = 0; g < grades.length; g++) {
   if(grades[g] > avg){
       results++;
      }
  }
    // Displaying everything
   System.out.println("The average is" + avg);
   System.out.println("The lowest grade is" + min);
   System.out.println("The highest grade is" + max);
   System.out.println("The number of students who scored above the average are" + results ); 
  
 
  }
 }
  
  
  
      
    
       
        
        
  