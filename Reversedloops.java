import java.util.Scanner;
public class Reversedloops{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter number of row");
int numberOfrow= inputCollector.nextInt();

for(int rowCount= 1; rowCount<=numberOfrow; rowCount++){
    for(int gap = 1;gap<=rowCount;gap++){
    System.out.print(" ");
}
    for(int star = 1; star<=numberOfrow;star++){
    System.out.print("*");
}

    System.out.println();

}
}
}

 
