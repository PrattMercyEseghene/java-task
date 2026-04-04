import java.util.Scanner;
public class Square{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter your integer");
       int number= inputCollector.nextInt();
       int square = number * number ;
       System.out.printf("The square is %d%n", square);
}
}

javac Square.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Square.java
Enter your integer 5
The square is 25


