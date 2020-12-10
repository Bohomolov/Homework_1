import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoopsTest {

    //#=============================_1st_method_start_===================================
    @Test
    public void countSumEvenNumber() {
        Loops loops = new Loops();
        String expected = "Sum = 2450 Quantity = 49";
        String actual = loops.countSumEvenNumber();
        assertEquals(expected, actual);
    }
    //#=============================_1st_method_end_=====================================
    //#=============================_2nd_method_start_===================================
    @Test
    public void testCheckIsNumberPrime_1() {
        Loops loops = new Loops();
        String expected = "This number is prime";
        String actual = loops.checkIsNumberPrime(5);
        assertEquals(expected, actual);
    }
    @Test
    public void testCheckIsNumberPrime_2() {
        Loops loops = new Loops();
        String expected = "This number isn't prime";
        String actual = loops.checkIsNumberPrime(158);
        assertEquals(expected, actual);
    }
    @Test
    public void testCheckIsNumberPrime_exception() {
       Loops loops = new Loops();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loops.checkIsNumberPrime(0);
        }, "Incorrect value! The number should be equals 2 or more.");
    }
    //#=============================_2nd_method_end_=====================================
    //#=============================_3rd_method_start_===================================
    @Test
    public void testFindSqrt_1() {
        Loops loops = new Loops();
        int expected = 3;
        int actual = loops.findSqrt(9);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFindSqrt_2() {
        Loops loops = new Loops();
        int expected = 10;
        int actual = loops.findSqrt(100);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFindSqrt_exception() {
        Loops loops = new Loops();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loops.findSqrt(0);
        }, "Incorrect value! The number should be equals 1 or more.");
    }
    //#=============================_3rd_method_end_=====================================
    //#=============================_4th_method_start_===================================

    @Test
    public void testCountFactorial_1() {
        Loops loops = new Loops();
        int expected = 6;
        int actual = loops.countFactorial(3);
        assertEquals(expected, actual);

    }
    @Test
    public void testCountFactorial_exception() {
        Loops loops = new Loops();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loops.countFactorial(0);
        }, "Incorrect value! The number should be equals 1 or more.");
    }
    //#=============================_4th_method_end_=====================================
    //#=============================_5th_method_start_===================================

    @Test
    public void testCountSumOfDigits_1() {
        Loops loops = new Loops();
        int expected = 10;
        int actual = loops.countSumOfDigits(1234);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCountSumOfDigits_exception() {
        Loops loops = new Loops();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loops.countSumOfDigits(45-789);
        }, "Incorrect value! The number should be equals 0 or more.");
    }
    //#=============================_5th_method_end_=====================================
    //#=============================_6th_method_start_===================================
    @Test
    public void testReverseNumeral_1() {
        Loops loops = new Loops();
        String expected = "4321";
        String actual = loops.reverseNumeral(1234);
        Assert.assertEquals(expected, actual);
    }  @Test
    public void testReverseNumeral_2() {
        Loops loops = new Loops();
        String expected = "1";
        String actual = loops.reverseNumeral(1);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testReverseNumeral_3() {
        Loops loops = new Loops();
        String expected = "01";
        String actual = loops.reverseNumeral(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverseNumeral_exception() {
        Loops loops = new Loops();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loops.countSumOfDigits(45-789);
        }, "Incorrect value! The number should be equals 1 or more.");
    }
}