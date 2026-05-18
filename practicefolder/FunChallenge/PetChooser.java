import java.util.Scanner;
public class PetChooser{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter a pet");
String pet = inputCollector.nextLine();

if(pet.equals("Dogs")){

System.out.println("woof!! Dogs are awesome");
}
else{

System.out.println("cool, butt i love dogs!");
}



}

}
