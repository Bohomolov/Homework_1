import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import utils.Constants;

import static org.junit.Assert.assertEquals;

public class FunctionsTest {
    Functions functions = new Functions();

    //#=============================_1st_method_start_===================================
    @Test
    public void testShowOfTheDayOfWeek_0() {
        String expected = "Monday";
        String actual = functions.showDayOfTheWeek(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testShowOfTheDayOfWeek_1() {
        String expected = "Wednesday";
        String actual = functions.showDayOfTheWeek(3);
        assertEquals(expected, actual);
    }

    @Test
    public void testShowOfTheDayOfWeek_2() {
        String expected = "Sunday";
        String actual = functions.showDayOfTheWeek(7);
        assertEquals(expected, actual);
    }

    @Test
    public void testShowDayOfTheWeek_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            functions.convertNumberToString(45 - 789);
        }, "Incorrect value! The number should be equals 1 or more.");
    }

    @Test
    public void testShowDayOfTheWeek_exception_0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            functions.convertNumberToString(0);
        }, "Incorrect value! The number should be equals 1 or more.");
    }
    //============================_1st_method_end_=================================================
    //============================_2nd_method_start_===============================================

    @Test
    public void convertToString_1() {
        String expected = "One ";
        String actual = functions.convertNumberToString(1);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_10() {
        String expected = "Ten ";
        String actual = functions.convertNumberToString(10);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_7() {
        String expected = "Seven ";
        String actual = functions.convertNumberToString(7);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_15() {
        String expected = "Fifteen ";
        String actual = functions.convertNumberToString(15);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_20() {
        String expected = "Twenty ";
        String actual = functions.convertNumberToString(20);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_25() {
        String expected = "Twenty Five ";
        String actual = functions.convertNumberToString(25);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_55() {
        String expected = "Fifty Five ";
        String actual = functions.convertNumberToString(55);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_100() {
        String expected = "One hundred ";
        String actual = functions.convertNumberToString(100);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_101() {
        String expected = "One hundred One ";
        String actual = functions.convertNumberToString(101);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_115() {
        String expected = "One hundred Fifteen ";
        String actual = functions.convertNumberToString(115);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_178() {
        String expected = "One hundred Seventy Eight ";
        String actual = functions.convertNumberToString(178);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_225() {
        String expected = "Two hundred Twenty Five ";
        String actual = functions.convertNumberToString(225);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_250() {
        String expected = "Two hundred Fifty ";
        String actual = functions.convertNumberToString(250);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_601() {
        String expected = "Six hundred One ";
        String actual = functions.convertNumberToString(601);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_611() {
        String expected = "Six hundred Eleven ";
        String actual = functions.convertNumberToString(611);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_900() {
        String expected = "Nine hundred ";
        String actual = functions.convertNumberToString(900);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_90() {
        String expected = "Ninety ";
        String actual = functions.convertNumberToString(90);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_50() {
        String expected = "Fifty ";
        String actual = functions.convertNumberToString(50);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_500() {
        String expected = "Five hundred ";
        String actual = functions.convertNumberToString(500);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_719() {
        String expected = "Seven hundred Nineteen ";
        String actual = functions.convertNumberToString(719);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_400() {
        String expected = "Four hundred ";
        String actual = functions.convertNumberToString(400);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_300() {
        String expected = "Three hundred ";
        String actual = functions.convertNumberToString(300);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToString_999() {
        String expected = "Nine hundred Ninety Nine ";
        String actual = functions.convertNumberToString(999);
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseNumeral_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            functions.convertNumberToString(45 - 789);
        }, "Incorrect value! The number should be equals 1 or more.");
    }

    @Test
    public void testReverseNumeral_exception_0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            functions.convertNumberToString(0);
        }, "Incorrect value! The number should be equals 1 or more.");
    }

    //============================_2nd_method_end_=================================================
    //============================_3rd_method_start_===============================================

    @Test
    public void convertToInt_1() {
        int expected = 1;
        int actual = functions.convertStringToNumber("one");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_2() {
        int expected = 2;
        int actual = functions.convertStringToNumber("two");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_5() {
        int expected = 5;
        int actual = functions.convertStringToNumber("five");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_15() {
        int expected = 15;
        int actual = functions.convertStringToNumber("fifteen");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_25() {
        int expected = 25;
        int actual = functions.convertStringToNumber("twenty five");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_50() {
        int expected = 50;
        int actual = functions.convertStringToNumber("fifty");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_57() {
        int expected = 57;
        int actual = functions.convertStringToNumber("fifty seven");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_100() {
        int expected = 100;
        int actual = functions.convertStringToNumber("one hundred");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_101() {
        int expected = 101;
        int actual = functions.convertStringToNumber("one hundred one");
        assertEquals(expected, actual);
    }

    @Test
    public void convertToInt_105() {
        int expected = 105;
        int actual = functions.convertStringToNumber("one hundred five");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_110() {
        int expected = 110;
        int actual = functions.convertStringToNumber("one hundred ten");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_120() {
        int expected = 120;
        int actual = functions.convertStringToNumber("one hundred twenty");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_150() {
        int expected = 150;
        int actual = functions.convertStringToNumber("one hundred fifty");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_155() {
        int expected = 155;
        int actual = functions.convertStringToNumber("one hundred fifty five");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_283() {
        int expected = 283;
        int actual = functions.convertStringToNumber("two hundred eighty three");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_300() {
        int expected = 300;
        int actual = functions.convertStringToNumber("three hundred");
        assertEquals(expected, actual);
    }
    @Test
    public void convertToInt_999() {
        int expected = 999;
        int actual = functions.convertStringToNumber("nine hundred ninety nine");
        assertEquals(expected, actual);
    }

    @Test
    public void convertToInt_exception_0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            functions.convertStringToNumber("sssss");
        }, Constants.INCORRECT_VALUE_S);
    }
}
