// Asking for userinput
// until they enter a negative number
// print average of all positive number

import java.util.Scanner;

public class Negative{
public static void main(String[] args) {
        int numberOfInputs = 0;
        double numberSummation = 0;
while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter A number: ");
            int numberInputed = scanner.nextInt();
            if (numberInputed < 0){
                break;
            }

 
 numberOfInputs = numberOfInputs + 1;

            numberSummation = numberSummation + numberInputed;
        }

        if (numberOfInputs == 0){
            System.out.println("The average of the numbers is: " + numberSummation);

        }

        System.out.println("The average of the numbers is: " + numberSummation/numberOfInputs);
    }

}



