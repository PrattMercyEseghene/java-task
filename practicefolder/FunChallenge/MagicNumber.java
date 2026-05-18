//Magic Number Create a magic number game! Make a locked box called “magic number” set to 42. Ask the user for a number and save it in a box. If they pick 42, say, “You found the magic number!” If not, say, “Keep looking!” Use a choice. 
import java.util.Scanner;
public class MagicNumber{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter number");
int number = inputCollector.nextInt();

if(number == 42){

System.out.println("You found the magic number!");
}else{

System.out.print("keep looking!!!");
}
}
}
