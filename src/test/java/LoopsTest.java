import org.junit.Assert;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoopsTest {
    Loops loops = new Loops();

    @Test
    public void countSumEvenNumber() {
        String expected = "Sum = 2450 Quantity = 49";
        String actual = loops.countSumEvenNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void showPrime() {
        String expected = "This number is prime";
        String actual = loops.showPrime(157);
        assertEquals(expected, actual);
    }

    @Test
    public void sqrt() {
        int expected = 3;
        int actual = loops.sqrt(9);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorial() {
        int expected = 6;
        int actual = loops.factorial(3);
        assertEquals(expected, actual);
    }

    @Test
    public void countSum() {
        int expected = 10;
        int actual = loops.countSum(1234);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void reverse() {
        String expected = "4321";
        String actual = loops.reverse(1234);
        Assert.assertEquals(expected, actual);
    }
}