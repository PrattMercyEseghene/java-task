import java.util.Scanner;
public class Difference{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter your first integer");
       int number1= inputCollector.nextInt();
       System.out.printf("Enter your second integer");
       int number2 = inputCollector.nextInt();
       int difference = number1 - number2;
       System.out.printf("The difference is %d%n", difference);
}
}
javac Difference.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Difference.java
Enter your first integer 50
Enter your second integer 30
The difference is 20

