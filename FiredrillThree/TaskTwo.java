import java. util.Scanner;
public class TaskOne{
public static void main(String[]args){

Scanner inputCollector = new Scanner(System.in);
int [] list = new int [10];
System.out.println("Enter ten scores");

for(int number= 0; number<list.length; number++){

System.out.println("Enter a score"+ number+": ");
list[number]=inputCollector.nextInt();
    System.out.println(list[number]);
}

for(int number= 0; number<list.length; number++){
     System.out.println(list[number]);
}
} 
}





    
    
    
    
    








