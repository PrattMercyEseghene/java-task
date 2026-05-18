import java.util.Scanner;
public class Name{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter a name");
String name = inputCollector.nextLine();

if(name.equals("friend")){

    System.out.println("Hi, friend");

}
else{

System.out.println("Hi, stranger");
}

}

}
