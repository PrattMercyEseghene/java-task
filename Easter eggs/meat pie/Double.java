import java.util.Scanner;
public class Double{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter your integer");
       int number= inputCollector.nextInt();
       int result = number * 2;
       System.out.printf("The double is %d%n", result);
}
}
javac Double.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Double.java
Enter your integer 5
The double is 10

