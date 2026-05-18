//Print Your Name Make your name a star! Ask the user for their name and save it in a box. Show their name 3 times, like “Emma!” on one line, then “Emma!” again, and one more time. Repeat this 3 times. 

import java.util.Scanner;
public class PrintNames{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter name");
String name = inputCollector.nextLine();

for(int i = 1; i <=3;i++){

System.out.println("\"" + name + "!\"");

}


}
}
