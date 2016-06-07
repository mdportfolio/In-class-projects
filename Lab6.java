package lab6;
import java.util.Scanner;
import java.io.*;

public class Lab6 {

    public static void main(String[] args) {
     Scanner readit = new Scanner("C:\\Users\\Owner\\OneDrive\\Documents\\grades.txt"); //readig from txt file
     String fileTitle = "binaryGrade.dat";
     PrintWriter ops = null;
     try {
     ops = new PrintWriter(new FileOutputStream(fileTitle, true));
     } catch(FileNotFoundException e){
     System.out.println("Error opening the file" + fileTitle);
     System.exit(0);
     }
     String person = readit.next();
     int score = readit.nextInt();
     readit.close();
     
     
     
     
     System.out.println("The average is" );  
    }
}
 
           
   
