public class SmallMathApp{
static double numberOne = 15;
static double numberTwo = 10;
public static double addNumbers(){
return numberOne + numberTwo;

}
public static double substractNumbers(){
return numberOne - numberTwo;
}

public static double multiplyNumbers(){
return numberOne * numberTwo;
}

public static double divisionNumbers(){
return numberOne / numberTwo;


}

public static double operators(String symbol){
double total= 0;

if(symbol.equals("*")){

total = multiplyNumbers();
}
else if(symbol.equals("+")){
total = addNumbers();
}

else if(symbol.equals("-")){
total=substractNumbers();
}
else if(symbol.equals("/")){
total = divisionNumbers();
}
else {
 throw new IllegalArgumentException("Invalid operation!!");
 }
    return total;
}


}

