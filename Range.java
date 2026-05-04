public class Range{
public static int number(int [] numbers){
    int largest = numbers[0];
    int lowest = numbers[0];
for(int i = 0; i < numbers.length; i++){
    if (numbers[i] > largest){
    largest = numbers[i];
}
    if(numbers[i] < lowest){
    lowest = numbers[i];
}

}
    int  result = largest - lowest;
    return result;




}


}





