import java.util.Scanner;
public class Radius{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("Enter radius");
       double radius = inputCollector.nextDouble();
       double area = Math.PI *radius * radius;
       System.out.println("Area of circle is"+ area);
}
}
javac Radius.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Radius.java
Enter radius 5
Area of circle is78.53981633974483

