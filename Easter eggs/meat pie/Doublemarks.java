import java.util.Scanner;
public class Doublemarks{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.println("Enter interger marks");
       int marks = inputCollector.nextInt();
       double marksdouble = (double) marks;
        System.out.println("Interger marks" + marks);
        System.out.println("double marks"+ marksdouble);
}
}
javac Doublemarks.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Doublemarks.java
Enter interger marks
78
Interger marks78
double marks78.0

