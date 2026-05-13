public class OshoFree{
public static double calculatePriceDiscount(int cartTotal, String promoCode){

String promo = promoCode.toUpperCase();
double price = 0;


if(cartTotal < 5000){
    price = cartTotal;
    
}

else if (cartTotal >= 5000 && cartTotal <= 14999 && promo.equals("STARTER10")){

double discount = cartTotal * 0.1;
price = cartTotal - discount;

}
else if (cartTotal >= 15000 && cartTotal <= 29999 && promo.equals("BIGBOY20")){

double discount = cartTotal * 0.2;
price = cartTotal - discount;

}
else if (cartTotal >= 30000 && promo.equals("OSHOFREE35")){

double discount = cartTotal * 0.35;
price = cartTotal - discount;
}

else{

price = cartTotal;
}

return price;

}
        public static void main(String[]args){
        
            System.out.println(calculatePriceDiscount(30000 , "OshoFree35"));
        
        }

}


