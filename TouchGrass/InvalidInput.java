import java.util.Scanner;

public class InvalidInput {
    public static void main(String[] args) {
        //Prompt user to enter lower case or upper case letter
        //Display the number the letter is coming from



        //steps
        //1. take in user input
        // compare the user input and
        //2. display the corresponding number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a letter: ");
        String letter = scanner.nextLine();

        if ("abc".contains(letter.toLowerCase())){
            System.out.println("This is in number 2");
        } 
            else if ("def".contains(letter.toLowerCase())){
            System.out.println("This is in number 3");
        } 
            else if ("ghi".contains(letter.toLowerCase())){
            System.out.println("This is in number 4");
        } 
            else if ("jkl".contains(letter.toLowerCase())){
            System.out.println("This is in number 5");
        } 
            else if ("mno".contains(letter.toLowerCase())){
            System.out.println("This is in number 6");
        } 
            else if ("pqrs".contains(letter.toLowerCase())){
            System.out.println("This is in number 7");
        } 
            else if (("tuv".contains(letter.toLowerCase()))){
            System.out.println("This is in number 8");
        } 
            else if ("wxyz".contains(letter.toLowerCase())){
            System.out.println("This is in number 9");
        }
            else {
            System.out.println("This is an invalid input");
        }
    }
}
