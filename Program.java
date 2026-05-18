import java.util.Scanner;
public class Colour{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter a colour");
String colour = inputCollector.nextLine();

if(colour == green){
 System.out.println("Go");
}

else if(colour == yellow){
System.out.println("Get ready");
}
else if(colour == red){

System.out.println("Stop");
}
else{
System.out.println("invalid colour");
}
}
}




