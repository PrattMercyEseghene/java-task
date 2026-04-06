import java.util.Scanner;
public class Squaremeters{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter squaremeters");
        double squaremeters = input.nextDouble();
        double ping= squaremeters * 0.3025;
        System.out.println("Coverting squaremeters to ping" + ping);
}
}
javac Squaremeters.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/HotDog$ java Squaremeters.java
Enter squaremeters
10
Coverting squaremeters to ping3.025

