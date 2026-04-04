import java.util.Scanner;
public class Addition{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter your first integer");
       int number1= inputCollector.nextInt();
       System.out.printf("Enter your second integer");
       int number2 = inputCollector.nextInt();
       int sum = number1 + number2;
       System.out.printf("The sum is %d%n", sum);
}
}

javac Addition.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Addition.java
Enter your first integer 10
Enter your second integer 20
The sum is 30

