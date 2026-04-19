import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        int number = scanner.nextInt();


        for (int i = number; number >= 1; number--) {
            System.out.println(number);
        }
    }
}
