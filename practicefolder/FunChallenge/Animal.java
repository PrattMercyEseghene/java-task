import java. util.Scanner;
public class Animal{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter name of animal");
String animal = inputCollector.nextLine();

if(animal.equals("Dog")){

System.out.println("correct!it's a Dog");
}
else{

System.out.println("Nope!! it's a Dog");
}


}

}
