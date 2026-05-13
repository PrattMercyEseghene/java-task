import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class OshoFreePromoTest{
@Test
public void TestThatCarTotalIs5000WithoutPromoCode(){
    double expected = 5000;
    double actual = OshoFree.calculatePriceDiscount(5000 , "");
    assertEquals(expected , actual);

}

@Test
public void TestThatCarTotalIs5000WithInvalidPromoCode(){
    double expected = 5000;

    double actual = OshoFree.calculatePriceDiscount(5000, "epdghtek");
    assertEquals(expected , actual);


}
@Test
public void TestThatCarTotalIs4500WithpromoCode(){
    double expected = 4500;
    
    double actual = OshoFree.calculatePriceDiscount(5000, "STARTER10");
    assertEquals(expected , actual);


}
@Test
public void TestThatCarTotalIs12000WithPromoCode(){
    double expected = 12000;
    double actual = OshoFree.calculatePriceDiscount(15000, "BiGBOY20");
    assertEquals(expected , actual);

}
@Test
public void TestThatCarTotalIs19500WithPromoCode(){
double expected = 19500;
double actual = OshoFree.calculatePriceDiscount(3000 , "OSHOFREE35");
}
}
