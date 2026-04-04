import java.util.Scanner;
public class Cube{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter your integer");
       int number= inputCollector.nextInt();
       int cube = number * number * number;
       System.out.printf("The cube is %d%n", cube);
}
}
javac Cube.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Cube.java
Enter your integer 12
The cube is 1728

