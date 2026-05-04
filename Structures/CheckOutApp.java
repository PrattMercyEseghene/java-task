import java . util.Scanner;
public class CheckOutApp{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);


System.out.print("""
    ------> WELCOME TO PRATTY STORES <-------
    """
);

int grandtotal = 0
    System.out.print("Enter Customers name: ");
    String name = inputCollector.nextLine();
    
    
    
    while (true){
    
    System.out.print("What did the user buy: ");
    String goods = inputCollector.nextLine();
    
    System.out.print("How many Pieces: ");
    int pieces = inputCollector.nextInt();
    
    System.out.print("How much per unit: ");
    int price = inputCollector.nextInt();
    
    System.out.println("Add mor items yes/no:");
    String choice = inputCollector.nextLine();
    
    if(!choice.equalsIgnorCase("yes")){
    break;
    }
    
    
    int total = pieces * price;
    grandtotal += total;
    
       
    
}
    

}




}
