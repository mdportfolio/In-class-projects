package lab3;
import java.util.Scanner;
public class Lab3 {
    
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int scores [] = new int [10]; // the limit number of students grades entered
    int sum = 0;
    double avg;
    System.out.println("Enter your students' grades:");
 // finding the average of the students' grades
    for(int i = 0; i < scores.length; i++){
     scores[i] = kb.nextInt();
     try{ // exception handling
    if(scores[i] < 0)throw new IllegalArgumentException("No Negative Numbers!"); 
     }catch(IllegalArgumentException ex){
     System.out.println("No Negative Numbers!");
     System.out.println("Re-enter your students' grades.");
     i--;
     } 
     sum = sum + scores[i];
     } 
     avg = sum / scores.length;
   // finding the number of students who scored above the average     
   int r = 0;
   for(int g = 0; g < scores.length; g++) {
   if(scores[g] > avg){
       r++;
      }
  }    
     System.out.println("The average grade is: " + avg);
     System.out.println("The number of students who scored above average: " + r);
        
    }
}

   
