import java.util.Scanner;
import java.util.Arrays;
public class PrintArray{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);

int[] scores = new int[10];


for(int count = 0; count<=10; count++){
System.out.print("Enter a score");

scores[count] = inputCollector.nextInt();

System.out.print(Arrays.toString(scores));
}
}
}
