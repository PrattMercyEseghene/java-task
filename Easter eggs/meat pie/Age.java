import java.util.Scanner;
public class Age{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.printf("What is your age?");
       int age = inputCollector.nextInt();
       System.out.printf("Hello, you are %d years old%n", age);
}
}
output.txt
javac Age.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Age.java
What is your age? 25
Hello, you are 25 years old

