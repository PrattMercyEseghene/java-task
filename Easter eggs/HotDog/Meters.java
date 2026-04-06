import java.util.Scanner;
public class Meters{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter meters");
        double meters = input.nextDouble();
        double feet = meters * 3.2786;
        System.out.println("Coverting meters to feet " + feet);
}
}
javac Meters.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/HotDog$ java Meters.java
Enter meters
2.5
Coverting meters to feet 8.1965

