import org. junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmallMathAppTest{
@Test
public void testThatSmallMathAppExist(){

SmallMathApp.operators("+");

}
@Test
public void testThatMultiplyisMultiplyingNumbers(){
double expected = 150;
double actual = SmallMathApp.operators("*");
assertEquals(expected, actual);


}
@Test
public void testThatAddIsAddingNumbers(){
double expected = 25;
double actual = SmallMathApp.operators("+");
assertEquals(expected, actual);

}
@Test
public void testThatSubstractIsSubstractingNumbers(){
double expected = 5;
double actual = SmallMathApp.operators("-");
assertEquals(expected, actual);
}
@Test
public void testThatDivisionIsDividingNumbers(){
double expected = 1.5;
double actual = SmallMathApp.operators("/");
assertEquals(expected,actual);
}
}

