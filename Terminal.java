import java.util.Scanner;
public class Terminal{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = inputCollector.nextInt();
        
        
   if(number==7){
   System.out.println("CORRECT");
   
   }else if(number > 7){
   
   System.out.println("ABOVE");
   
   }else{
        
        System.out.println("BELOW");
   }
   
}
}
