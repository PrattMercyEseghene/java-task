import java. util.Scanner;
public class Substraction{
public static void main(String[]args){

int numberOfQuestions=5;
int correctCount=0;
int count=0;
long startTime = System.currentTimeMillis();
String output = " ";

Scanner inputCollector = new Scanner(System.in);

while (count<numberOfQuestions){

int number1 = (int)(Math.random( * 10);
int number2 = (int)(Math.random() * 10);

if(number1<number2){
int temp = number1;
number1 = number2;
number2 = temp;
}
System.out.println("What is"+ number1 + "-" + number2 + "? ");
int answer = input.nextInt();

if(number1 - number2 == answer){

System.out.println("you are correct !");
correctCount++;
}
else{
System.out.println("your answer is wrong.\n" + number1 + "-" + number2 + "should be " +(number1-numbber2));
count++;

output += "\n" + number1 + "-"
+ number2 + "=" + answer + ((number1 - number2 ==answer)? "correct" : "wrong");

}
long endTime = System.currentTimeMillis();
long TestTime = endTime - startTime;

System.out.println("correct count is " + correctCount + "\nTest time is "testTime/1000 + "seconds\n" + output);
}
}
