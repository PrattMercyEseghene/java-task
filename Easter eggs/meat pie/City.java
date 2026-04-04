import java.util.Scanner;
public class City{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.print("Enter your city name");
       String name = inputCollector.nextLine();
 System.out.println("I live in " + name);
}
}
javac City.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java City.java
Enter your city name lagos
I live in  lagos

