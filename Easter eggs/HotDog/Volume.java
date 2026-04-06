import java.util.Scanner;
public class Volume{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter lengthofsides");
        double lengthofsides = input.nextDouble();
        double area = Math.sqrt(3) / 4 * Math.pow(lengthofsides,2);
        double volume = area * lengthofsides;
        System.out.println("The volume of the triangular prism is " + volume);
}
}
javac Volume.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/HotDog$ java Volume.java
Enter lengthofsides
5.5
The volume of the triangular prism is 72.04248827731799


