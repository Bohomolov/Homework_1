import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoopsTest {
    Loops loops = new Loops();

    //#=============================_1st_method_start_===================================
    @Test
    public void countSumEvenNumber() {
        String expected = "Sum = 2450 Quantity = 49";
        String actual = loops.countSumEvenNumber();
        assertEquals(expected, actual);
    }

    //#=============================_1st_method_end_=====================================
    //#=============================_2nd_method_start_===================================
    @Test
    public void testCheckIsNumberPrime_0() {
        String expected = "This number is prime";
        String actual = loops.checkIsNumberPrime(2);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckIsNumberPrime_0_1() {
        String expected = "This number isn't prime";
        String actual = loops.checkIsNumberPrime(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckIsNumberPrime_1() {
        String expected = "This number is prime";
        String actual = loops.checkIsNumberPrime(5);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckIsNumberPrime_2() {
        String expected = "This number isn't prime";
        String actual = loops.checkIsNumberPrime(158);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckIsNumberPrime_3() {
        String expected = "This number isn't prime";
        String actual = loops.checkIsNumberPrime(6);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckIsNumberPrime_4() {
        String expected = "This number is prime";
        String actual = loops.checkIsNumberPrime(157);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckIsNumberPrime_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loops.checkIsNumberPrime(0);
        }, "Incorrect value! The number should be equals 2 or more.");
    }

    @Test
    public void testCheckIsNumberPrime_exception_1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loops.checkIsNumberPrime(-2);
        }, "Incorrect value! The number should be equals 2 or more.");
    }

    //#=============================_2nd_method_end_=====================================
    //#=============================_3rd_method_start_===================================
    @Test
    public void testFindSqrt_0() {
        String expected = "2";
        String actual = loops.findSqrt(4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindSqrt_1() {
        String expected = "3";
        String actual = loops.findSqrt(9);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindSqrt_2() {
        String expected = "10";
        String actual = loops.findSqrt(100);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindSqrt_3() {
        String expected = "This number has no square.";
        String actual = loops.findSqrt(189);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindSqrt_4() {
        String expected = "This number has no square.";
        String actual = loops.findSqrt(259);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindSqrt_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loops.findSqrt(0);
        }, "Incorrect value! The number should be equals 1 or more.");
    }

    @Test
    public void testFindSqrt_exception_1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loops.findSqrt(-1);
        }, "Incorrect value! The number should be equals 1 or more.");
    }
    //#=============================_3rd_method_end_=====================================
    //#=============================_4th_method_start_===================================

    @Test
    public void testCountFactorial_1() {
        int expected = 6;
        int actual = loops.countFactorial(3);
        assertEquals(expected, actual);

    }

    @Test
    public void testCountFactorial_2() {
        int expected = 362880;
        int actual = loops.countFactorial(9);
        assertEquals(expected, actual);

    }

    @Test
    public void testCountFactorial_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loops.countFactorial(0);
        }, "Incorrect value! The number should be equals 1 or more.");
    }

    @Test
    public void testCountFactorial_exception_1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loops.countFactorial(-15);
        }, "Incorrect value! The number should be equals 1 or more.");
    }

    //#=============================_4th_method_end_=====================================
    //#=============================_5th_method_start_===================================
    @Test
    public void testCountSumOfDigits_0() {
        int expected = 0;
        int actual = loops.countSumOfDigits(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountSumOfDigits_1() {
        int expected = 10;
        int actual = loops.countSumOfDigits(1234);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountSumOfDigits_2() {
        int expected = 1;
        int actual = loops.countSumOfDigits(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountSumOfDigits_3() {
        int expected = 3;
        int actual = loops.countSumOfDigits(12);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountSumOfDigits_4() {
        int expected = 46;
        int actual = loops.countSumOfDigits(1234567891);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountSumOfDigits_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loops.countSumOfDigits(45 - 789);
        }, "Incorrect value! The number should be equals 0 or more.");
    }

    //#=============================_5th_method_end_=====================================
    //#=============================_6th_method_start_===================================
    @Test
    public void testReverseNumeral_1() {
        String expected = "4321";
        String actual = loops.reverseNumeral(1234);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverseNumeral_2() {
        String expected = "1";
        String actual = loops.reverseNumeral(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverseNumeral_3() {
        String expected = "01";
        String actual = loops.reverseNumeral(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverseNumeral_4() {
        String expected = "201";
        String actual = loops.reverseNumeral(102);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testReverseNumeral_5() {
        String expected = "2";
        String actual = loops.reverseNumeral(02);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverseNumeral_exception_0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loops.reverseNumeral(0);
        }, "Incorrect value! The number should be equals 1 or more.");
    }

    @Test
    public void testReverseNumeral_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loops.reverseNumeral(45 - 789);
        }, "Incorrect value! The number should be equals 1 or more.");
    }
}