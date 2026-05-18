import java.util.Scanner;
import java.util.Arrays;
public class PrintArrayTwo{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);

int[] scores = new int[10];


for(int count = 0; count<scores.length; count++){
System.out.print("Enter a score:   ");

scores[count] = inputCollector.nextInt();
}
for(int count=0; count<scores.length;count++){
    System.out.print(scores[count]);
}
}
}
