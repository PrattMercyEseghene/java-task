import java.util.Scanner;
public class Average{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter your integer");
       int number1= inputCollector.nextInt();
       System.out.printf("Enter your integer");
       int number2 = inputCollector.nextInt ();
       System.out.printf("Enter your integer");
       int number3 = inputCollector.nextInt();
       int result= number1 + number2 + number3 / 3;
       System.out.print("The integers average is " + result);
}
}
javac Average.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Average.java
Enter your integer 2
Enter your integer 3
Enter your integer 4
The integers average is 6
