package wahala;

public class BackToSenderTest{
    public int calculateCommission(int successfulDelivery){
        double percentage = ((double) successfulDelivery /100) * 100;
        System.out.println("This is the percentage" + percentage);
        int amountPerParcel = 0;
        int basePay = 5000;

        if (percentage < 50){
            amountPerParcel = 160;
        }else if(percentage >= 50 && percentage <= 59){
            amountPerParcel = 200;
        }else if(percentage >= 60 && percentage <= 69){
            amountPerParcel = 250;
        }else{
            amountPerParcel = 500;
        }

        int amountToBePaid = (successfulDelivery * amountPerParcel) + basePay;

        return amountToBePaid;
    }
}
