import java.util.Scanner;
public class Half{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter your integer");
       int number= inputCollector.nextInt();
       int result = number / 2;
       System.out.printf("The half is %d%n", result);
}
}
javac Half.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Half.java
Enter your integer 10
The half is 5

