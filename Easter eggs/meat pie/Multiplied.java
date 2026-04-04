import java.util.Scanner;
public class Multiplied{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter your integer");
       int number= inputCollector.nextInt();
       int result= number * 5;
       System.out.print("The number multiplied is " + result);
}
}
javac Multiplied.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Multiplied.java
Enter your integer 5
The number multiplied is 25
