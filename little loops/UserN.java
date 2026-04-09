import java.util.Scanner;
public class UserN{
    public static void main(String [] args){
    Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter integer ");
       int N = inputCollector.nextInt();
            for (int i=N; i>= 1; i--){
               System.out.println(i);
            }
        }
    }
