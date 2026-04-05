import java.util.Scanner;
public class Swap{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.print("Enter integer");
       int a = inputCollector.nextInt();
       System.out.print("Enter integer");
       int b = inputCollector .nextInt();
       int temp = a;
        a = b;
        b = a;
        System.out.printf("After swapping ,a = " + a + ", b = " + b);
}
}
javac Swap.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Swap.java
Enter integer 6
Enter integer 7
After swapping ,a = 7, b = 7
