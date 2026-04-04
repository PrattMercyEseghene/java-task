import java.util.Scanner;
public class Remainder{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter your integer");
       int number= inputCollector.nextInt();
       int result= number / 2;
       System.out.print("The remainder of the number is " + result);
}
}
java Remainder.java
Enter your integer 15
The remainder of the number is 7
