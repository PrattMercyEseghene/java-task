import java.util.Scanner;
public class Plus{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter your integer");
       int number= inputCollector.nextInt();
       int result= number * 10;
       System.out.print("The plus of the number is " + result);
}
}
javac Plus.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Plus.java
Enter your integer 5
The plus of the number is 50
