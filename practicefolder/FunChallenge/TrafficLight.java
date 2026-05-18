import java.util.Scanner;
public class TrafficLight{
public static void main(String[]args){
//Be a traffic light controller! Ask the user for a color (like “red” or “green”) and save it in a box. If it’s “green,” say, “Go!” If it’s “red,” say, “Stop!” If it’s “yellow,” say, “Wait!” Use choices to pick the right message.
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter a color");
String answer = inputCollector.nextLine();

if(answer.equals("green")){

System.out.println("Go");
}
else if(answer.equals("red")){
System.out.println("Stop");


}
else if(answer.equals("yellow")){

System.out.println("Wait");
}
else{

System.out.println("invalid");
}


}



}
