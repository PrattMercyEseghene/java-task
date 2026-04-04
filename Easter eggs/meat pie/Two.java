import java.util.Scanner;
public class Two{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter your integer");
       int number1 = inputCollector.nextInt();
       System.out.printf("Enter your integer");
       int number2 = inputCollector .nextInt();
 System.out.printf("Return number %d%n %d%n", number1 , number2 );
}
}
javac Two.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Two.java
Enter your integer 4
Enter your integer 5
Return number 4
 5

