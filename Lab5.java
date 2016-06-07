package lab5;
import java.io.*;
import java.util.*;
public class Lab5 {
   
    public static void main(String[] args) {
    if(args.length != 4){
    System.out.println("Usage java replacement source");
    System.exit(0);
    }
    File sourceFile = new File(args [0]);
    if(!sourceFile.exists()){
    System.out.println("Source file" + args[0] + "doesn't exist.");
    System.exit(0);
    }
    File targetFile = new File(args [1]);
    if (targetFile.exists()){
    System.out.println("Target File" + args[1] + "already exists");
    System.exit(0);
    }
    String fileTitle = "grades.txt"; // Creating grades text file
    PrintWriter printer = null;
    try{
    printer = new PrintWriter(fileTitle);
    }catch(FileNotFoundException e){
    System.out.println("Error in opening your file," + fileTitle);
    System.exit(0);
    }
    for(int c = 1; c <= 10; c++){
    printer.println(c + "" + fileTitle);
    printer.close();
    }
    Scanner input = null;
    try {
    input = new Scanner(sourceFile);
    } catch(FileNotFoundException e){
    System.out.println("Error opening the file" + sourceFile);
    }
    File grades = new File("newgrades.txt"); //Creating new grades file
    try{
     printer = new PrintWriter(grades);
     BufferedReader reader = new BufferedReader(new FileReader(grades));
             String line = "", oldtext = "";
             while(input.hasNext()){
                 oldtext = input.nextLine();
                 String newtext = oldtext.replaceAll("100", "Excellent!");
                 reader.close();
                 printer.write(newtext);
                 printer.close();
                 }
         }catch (IOException ioe)
             {
             ioe.printStackTrace(); 
             }
   
    }
    
}
     
             
             
            
             
             
         
         
