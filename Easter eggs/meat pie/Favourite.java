import java.util.Scanner;
public class Favourite{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.print("What is your favourite colour");
       String name = inputCollector.nextLine();
       System.out.printf("What is your favourite %s", name);
}
}
javac Favourite.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Favourite.java
What is your favourite colour purple

