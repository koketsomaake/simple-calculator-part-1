import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
    @Test
    public void addTest(){
        Assert.assertEquals(Calculator.add(3,4,5),12);
    }
    @Test
    public void multiplyRest(){
        Assert.assertEquals(Calculator.multiply(4,5),20);
    }
}
