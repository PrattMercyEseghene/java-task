import java.util.Scanner;
public class Patterntwo{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter number of row");
int numberOfrow = inputCollector.nextInt();

for(int rowNumber = 1; rowNumber<=numberOfrow;rowNumber+){
    for(int gap = 1;gap<=rowNumber;gap++){
    System.out.print(" ");
}

    for(int star = 1;star<=numberOfrow;star+){
    System.out.print("*");
}
     System.out.println();
}
}
}

