// Find the sum of the first 10 positive integers //
package lab.pkg1;
import java.util.Scanner;
public class Lab1 {

    
    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     int result = 0;
     int n;
     int i = 0;
     do{
     System.out.print("Please enter integers:");
     n = keyboard.nextInt();
     if(n > 0){
     result += n;
     i++;
     }
     } while(i < 10);
     System.out.println("The sum is: " + result);
         
    }
   
}
