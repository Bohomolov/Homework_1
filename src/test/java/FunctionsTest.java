import org.junit.Test;
import org.junit.jupiter.api.Assertions;

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
    //============================_2nd_method_end_==================================================
    //============================_3rd_method_start_===============================================
    @Test
    public void convertStringToNumber_1() {
        String expected = "1";
        String actual = functions.convertStringToNumber("One ");
        assertEquals(expected, actual);
    }
    @Test
    public void convertStringToNumber_17() {
        String expected = "17";
        String actual = functions.convertStringToNumber("Seventeen ");
        assertEquals(expected, actual);
    }
}
