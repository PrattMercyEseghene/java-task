import java.util.Scanner;

public class StudentMajor{
    public static void main(String[] args) {
        //Prompt user to enter two characters
        //The first representing a student major
        //The second a digit 1 to 4 representing year
       //Display the full major name and year stat
        Scanner scanner = new Scanner(System.in);




        System.out.println("Please input a letter: ");
        String letter = scanner.nextLine();

        System.out.println("Enter years");
        int years = scanner.nextInt();
        
       
        if (letter.equals("i") && years == 1){
            System.out.println("Information Management and Freshman");
        } 
            else if (letter.equals("i") && years == 2){
            System.out.println("information Management and Sophomore");
        } 
            else if (letter.equals("i") && years ==3){
            System.out.println("Information Management and Junior");
        } 
            else if (letter.equals("i") && years ==4){
            System.out.println("Information Management and Senior");
        } 
            else if (letter.equals("c") && years ==1){
            System.out.println("Computer Science and Freshman");
        } 

           else if (letter.equals("c")&& years == 2){
            System.out.println("Computer Science and Sophomore");
        } 
            else if (letter.equals("c")&& years ==3){
            System.out.println("Computer Science and Junior");
        } 
            else if (letter.equals("c")&& years == 4){
            System.out.println("Computer Science and Senior");
        } 
            else if (letter.equals("a")&& years == 1){
            System.out.println("Accounting and Freshman");
        } 
            else if (letter.equals("a")&& years == 2){
            System.out.println("Accounting and Sophomore");
        } 
            else if (letter.equals ("a")&& years == 3){
            System.out.println("Accounting and Junior");
        } 
            else if (letter.equals ("a")&& years == 4){
            System.out.println("Accounting and Senior");
        } 
            else{
            System.out.println("Display full major name and year status");
        } 
 }
}
  
