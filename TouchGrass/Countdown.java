import java.util.Scanner;
public class Countdown{
public static void main(String []args){

Scanner inputCollector = new Scanner (System.in);
System.out.println("Enter a number");
int number = inputCollector.nextInt();

for(int i = number; number >=1;number--){

System.out.println(number);

}

 

 System.out.println("Blast off!!!");
}
}
