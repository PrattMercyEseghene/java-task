import java.util.Scanner;
//You’re checking tickets for a cool show! Create a locked box called “minimum age” set to 10. Ask the user for their age and save it in a box. If they’re 10 or older, say, “Welcome to the show!” If not, say, “Sorry, you’re too young!” Use a choice. 

public class AgeRestriction{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter age");
int age = inputCollector.nextInt();

if(age >=10){

System.out.println("\"Welcome to the show !!\"");
}
else{

System.out.println("if not,say,you're too young");
}
}
}
