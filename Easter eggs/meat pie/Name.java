import java.util.Scanner;
public class Name{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.print("Enter name");
       String name = inputCollector.nextLine();
       System.out.print("Enter age");
       int age = inputCollector .nextInt();
        System.out.println("I am"+ name + " " + age);
}
}
javac Name.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Name.java
Enter name Mercy
Enter age 18
I am Mercy 18

