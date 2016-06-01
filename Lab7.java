package lab7;
import java.util.*;

public class Lab7 {

    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in); 
       System.out.println("Enter a number:");
       int s = keyboard.nextInt();  
       System.out.print("Addition factorial:" + sum(s));
        
    }
    public static int sum(int s){
     if(s == 1){
         return 1;
     } else {
         return s + sum(s-1);
     }
}

}
