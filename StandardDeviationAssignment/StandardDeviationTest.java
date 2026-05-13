import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StandardDeviationTest{
@Test
public void TestThatStandardDeviationExists(){
int[]array = {2,3,4,5,6};
StandardDeviation.mean(array);



}
@Test
public void TestThatSumAddElementInArray(){
int[]array = {2,3,4,5,6};
double expected = 20;
double actual = StandardDeviation.sum(array);
assertEquals(actual , expected);
}
@Test
public void TestThatMeanGetMeanOfElementInArray(){
int[]array = {2,3,4,5,6};
double expected = 4;
double actual= StandardDeviation.mean(array);
assertEquals(actual , expected);

}
}

