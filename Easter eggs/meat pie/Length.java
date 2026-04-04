import java.util.Scanner;
public class Length{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter your length");
       int number1= inputCollector.nextInt();
       System.out.printf("Enter your width");
       int number2= inputCollector.nextInt();
       int result = number1 * number2;
       System.out.print("The area is " + result);
}
}
javac Length.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Length.java
Enter your length 8
Enter your width 5
The area is 40
