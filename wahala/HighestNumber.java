public class HighestNumber{
    public static int HighestNumber(int firstnumber, int secondnumber,int  thirdnumber ){

        int HighestNumber = firstnumber;

        if(secondnumber > HighestNumber){
           HighestNumber = secondnumber;

}
        if(thirdnumber > HighestNumber){

           HighestNumber = thirdnumber;

}

            return HighestNumber;

}
    public static void main(String[]args){

         int HighestNumber = 0;
        System.out.println(HighestNumber(50, 40, 60));

}

}

