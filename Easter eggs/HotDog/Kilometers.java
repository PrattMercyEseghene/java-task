import java.util.Scanner;
public class Kilometers{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter miles");
        double miles = input.nextDouble();
        double Kilometers = miles * 1.609;
        System.out.println("After converting to Kilometers" + Kilometers);
}
}
javac Kilometers.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/HotDog$ java Kilometers.java
Enter miles
5

