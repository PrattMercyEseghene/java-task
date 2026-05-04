import java.util.*;

public class TaskSeven {

    public static void reverseIntegers(int[] integers){
        Arrays.sort(integers);

        for (int i = integers.length - 1; i >= 0; i--){
            System.out.println(integers[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int count = 0;

        System.out.println("Input 10 integers");
        while (count < 10) {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            numbers[count] = input;
            count++;
        }

        reverseIntegers(numbers);
    }
}
