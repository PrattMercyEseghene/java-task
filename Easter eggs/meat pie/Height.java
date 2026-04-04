import java.util.Scanner;
public class Height{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter your base");
       int number1= inputCollector.nextInt();
       System.out.printf("Enter your height");
       int number2= inputCollector.nextInt();
       int result = number1 * number2 / 2;
       System.out.print("The area is " + result);
}
}
javac Height.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Height.java
Enter your base 6
Enter your height 8
The area is 24
