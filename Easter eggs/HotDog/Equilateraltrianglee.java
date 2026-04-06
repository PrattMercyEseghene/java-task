import java.util.Scanner;
public class Equilateraltrianglee{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter lengthofsides");
        double lengthofsides = input.nextDouble();
        double area = Math.sqrt(3) / 4 * Math.pow(lengthofsides,2);
        System.out.println("Enter area");
        double volume= area * lengthofsides;
        System.out.println("The volume of the triangular prism is " + volume);
}
}
