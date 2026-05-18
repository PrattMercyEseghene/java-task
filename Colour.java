import java.util.Scanner;
public class Colour{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.print("Enter a colour (green, yellow, red): ");
String colour = inputCollector.nextLine().toLowerCase();

      if (colour.equals("green")) {
        System.out.println("Go");
        } else if (colour.equals("yellow")) {
            System.out.println("Get Ready");
        } else if (colour.equals("red")) {
            System.out.println("Stop");
        } else {
        
            System.out.println("Invalid colour");
        }

        
    }
}




