import java.util.Scanner;
public class Threeblank{
       public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);

       System.out.print("Enter word");
       String a = inputCollector.nextLine();
       System.out.print("Enter word");
       String b = inputCollector .nextLine();
        System.out.println(a +"    "+ b);
}
}
javac Threeblank.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Threeblank.java
Enter word START
Enter word PUSH
 START     PUSH

