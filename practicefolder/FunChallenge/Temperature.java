import java. util.Scanner;
public class Temperature{
public static void main(String[]args){

//Be a weather helper! Ask the user for the temperature (like 25) and save it in a box. If it’s above 30, say, “Hot!” If it’s 15 to 30, say, “Nice!” If it’s below 15, say, “Cold!” Use choices to pick the message. 

Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter Temperature");
int temperature = inputCollector.nextInt();

if(temperature>30){

System.out.println("Hot");

}
else if(temperature>15){

System.out.println("Nice");
}
else{

System.out.println("Say  cold");
}
}
}
