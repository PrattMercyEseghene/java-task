//Show the times table for 5! Go from 1 to 10, saving each number in a box. Multiply it by 5 and show the result, like “5 x 1 = 5,” “5 x 2 = 10,” up to “5 x 10 = 50.” Repeat for all 10 numbers. 
public class MultiplicationTable{
public static void main(String[]args){
int multiplication = 5;
for(int count = 1; count<=10; count++){

multiplication = 5*count;

System.out.println("5 * "+ count + "="+ multiplication);
}
}
}



