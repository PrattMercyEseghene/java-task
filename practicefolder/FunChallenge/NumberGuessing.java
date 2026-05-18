import java. util.Scanner;
//Make a number guessing game! Create a locked box called “secret” set to 8. Keep asking the user for a number and save it in a box. If they guess 8, say, “Correct!” and stop. If not, say, “Try again!” and keep asking. Use a choice to check each guess.
public class NumberGuessing{
public static void main(String[]args){

Scanner inputCollector= new Scanner(System.in);

int number = 0;

for(int count = 0; count<=number; count++){

System.out.println("Enter a number");
 number = inputCollector.nextInt();

if(number== 8){

System.out.println("correct");
}
else{

System.out.println("Try again! and keep asking");
}
}
}

}
