import java.util.Scanner;
public class Divide{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.println("Enter interger");
       int number= inputCollector.nextInt();
       int division= number /3;
        System.out.printf("number divided is %dn", division);
        
}
}
javac Divide.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Divide.java
Enter interger
15
number divided is 5
