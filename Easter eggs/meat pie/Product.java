import java.util.Scanner;
public class Product{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter your first integer");
       int number1= inputCollector.nextInt();
       System.out.printf("Enter your second integer");
       int number2 = inputCollector.nextInt();
       int product = number1 * number2;
       System.out.printf("The product is %d%n", product);
}
}
javac Product.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Product.java
Enter your first integer 10
Enter your second integer 10
The product is 100

