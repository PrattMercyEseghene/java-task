import java.util.Scanner;
public class Equilateraltriangle{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter length of sides");
        double lengthofsides = input.nextDouble();
        double area = Math.sqrt(3) / 4 * Math.pow(lengthofsides,2);
        System.out.println("The area of the triangle is" + area);
}
}
java Equilateraltriangle.java
Enter length of sides
7.5
The area of the triangle is24.356964481437334

