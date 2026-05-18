import java.util.Scanner;
public class PasswordChecker{
//Pretend you’re guarding a secret clubhouse! Create a locked box called “password” set to “secret123.” Ask the user to type a password and save it in a box. If it matches the locked box, say, “Access granted! Welcome!” If not, say, “Access denied!” Use a choice to check. 

public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter a password");
String password = inputCollector.nextLine();

if(password.equals("secret123")){

System.out.println("\"Access granted! Welcome!\"");
}
else{
System.out.println("Access denied");
}
}
}
