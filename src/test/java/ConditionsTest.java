import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class ConditionsTest {
    Conditions cond = new Conditions();
//////////////////////////////_1st_method_start_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    public void test_getSumOrMultiply_1() {
        int expected = 3;
        int actual = cond.getSumOrMultiply(1, 2);
        assertEquals(expected, actual);
    }
    @Test
    public void test_getSumOrMultiply_2() {
        int expected = 6;
        int actual = cond.getSumOrMultiply(2, 3);
        assertEquals(expected, actual);
    }
//////////////////////////////_1st_method_end_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////_2nd_method_start_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    public void test_quarter_1() {
        String expected = "I quarter";
        String actual = cond.showQuarter(1, 1);
        Assertions.assertEquals(expected, actual);
    }    @Test
    public void test_showQuarter_2() {
        String expected = "II quarter";
        String actual = cond.showQuarter(-1, 1);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_showQuarter_3() {
        String expected = "III quarter";
        String actual = cond.showQuarter(-1, -1);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_showQuarter_4() {
        String expected = "IV quarter";
        String actual = cond.showQuarter(1, -1);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_showQuarter_5() {
        String expected = "Your point between I and II quarter";
        String actual = cond.showQuarter(0, 1);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_showQuarter_6() {
        String expected = "Your point between I and IV quarter";
        String actual = cond.showQuarter(1, 0);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_showQuarter_7() {
        String expected = "Your point between II and III quarter";
        String actual = cond.showQuarter(-1, 0);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_showQuarter_8() {
        String expected = "Your point between III and IV quarter";
        String actual = cond.showQuarter(0, -1);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_showQuarter_9() {
        String expected = "Your point equals O:O";
        String actual = cond.showQuarter(0, 0);
        Assertions.assertEquals(expected, actual);
    }
//////////////////////////////_2nd_method_end_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////_3rd_method_start_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    public void test_getSum_1() {
        int expected = 6;
        int actual = cond.getSum(1, 2, 3);
        Assertions.assertEquals(expected, actual);
    }
//////////////////////////////_3rd_method_end_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////_4th_method_start_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    public void test_countMax_1() {
        int expected = 63;
        int actual = cond.countMax(2, 10, 3);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_countMax_2() {
        int expected = 9;
        int actual = cond.countMax(1, 2, 3);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_countMax_3() {
        int expected = 14;
        int actual = cond.countMax(-2, 10, 3);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_countMa_4() {
        int expected = 16;
        int actual = cond.countMax(0, 10, 3);
        Assertions.assertEquals(expected, actual);
    }

//////////////////////////////_4th_method_end_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////_5th_method_start_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    public void testShowRating_1() {
        String expected = "F";
        String actual = cond.showRating(19);
        Assertions.assertEquals(expected, actual);
    }   @Test
    public void testShowRating_2() {
        String expected = "E";
        String actual = cond.showRating(39);
        Assertions.assertEquals(expected, actual);
    }   @Test
    public void testShowRating_3() {
        String expected = "D";
        String actual = cond.showRating(59);
        Assertions.assertEquals(expected, actual);
    }   @Test
    public void testShowRating_4() {
        String expected = "C";
        String actual = cond.showRating(74);
        Assertions.assertEquals(expected, actual);
    }   @Test
    public void testShowRating_5() {
        String expected = "B";
        String actual = cond.showRating(80);
        Assertions.assertEquals(expected, actual);
    }   @Test
    public void testShowRating_6() {
        String expected = "A";
        String actual = cond.showRating(99);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testShowRating_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           cond.showRating(-100);
        }, "Incorrect value, correct value [0 - 100]");
    }
}
//////////////////////////////_testing_end_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\