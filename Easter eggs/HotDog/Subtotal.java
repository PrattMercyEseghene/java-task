import java.util.Scanner;
public class Subtotal{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter subtotal");
        double subtotal = input.nextDouble();
        System.out.println("Enter gratuity rate");
        double gratuityrate = input.nextDouble();    
        double gratuity = subtotal * gratuityrate / 100;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is "+ gratuity);
         System.out.println("The total is "+ total);
}
}
javac Subtotal.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/HotDog$ java Subtotal.java
Enter subtotal
10
Enter gratuity rate
12
The gratuity is 1.2
The total is 11.2

