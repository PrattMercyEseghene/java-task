import java.util.Scanner;
public class Hello{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word= input.nextLine();
        System.out.println("She said \"" + word + "\"");
}
}
javac Hello.java
gamp@gamp-Latitude-7480:~/java-task/Easter eggs/meat pie$ java Hello.java
Enter a word
Hello
She said "Hello"

