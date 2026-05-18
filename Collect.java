import java.util.Scanner;
public class Collect{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = inputCollector.nextInt();

while(number != 7){
     System.out.print("Enter a number ");
    number = inputCollector.nextInt();

    }

   
    
System.out.println(number);

}
}

