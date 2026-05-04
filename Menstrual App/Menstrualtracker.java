import java.util.Scanner;
    public class Menstrualtracker{
    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);
    System.out.println("MENSTRUAL CYCLE TRACKER");
    String menstrualCycle = inputCollector.nextLine();

    System.out.println("How long is your menstrual cylcle(21-35)");
    int cycleLength = inputCollector.nextInt();

    System.out.println("How long is your period(3-7)");
    int periodLength = inputCollector.nextInt();

    System.out.println("When did your last period start");
    int lastPeriod = inputCollector.nextInt();
    
    
    
    int nextperiodDay = lastperiod + CycleLength;
    
        System.out.println("nextperiod day");
    
    int ovulationDay = lastperiod + CycleLength - 14;
        System.out.println("Approximate ovulation day"+ ovulationDay);
        
    }



}
