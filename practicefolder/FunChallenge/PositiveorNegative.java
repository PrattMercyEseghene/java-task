import java.util.Scanner;
public class PositiveorNegative{
public static void main(String[]args){

//Be a number detective! Ask the user for a number and save it in a box. If it’s bigger than 0, say, “Positive!” If it’s 0 or less, say, “Negative or zero!” Use a choice to decide what to say. 
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter a number");
int number = inputCollector.nextInt();

if(number >= 0){

System.out.println("postive");
}
if(number <= 0){

System.out.println("Negative or zero");
}
else{

System.out.println("use a choice to decide what to say");
}
}
}
