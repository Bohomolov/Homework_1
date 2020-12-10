import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class ConditionsTest {
//////////////////////////////_1st_method_start_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    public void test_getSumOrMultiply_1() {
        Conditions cond = new Conditions();
        int expected = 3;
        int actual = cond.getSumOrMultiply(1, 2);
        assertEquals(expected, actual);
    }
    @Test
    public void test_getSumOrMultiply_2() {
        Conditions cond = new Conditions();
        int expected = 6;
        int actual = cond.getSumOrMultiply(2, 3);
        assertEquals(expected, actual);
    }
//////////////////////////////_1st_method_end_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////_2nd_method_start_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    public void test_quarter_1() {
        Conditions cond = new Conditions();
        String expected = "I quarter";
        String actual = cond.showQuarter(1, 1);
        Assertions.assertEquals(expected, actual);
    }    @Test
    public void test_showQuarter_2() {
        Conditions cond = new Conditions();
        String expected = "II quarter";
        String actual = cond.showQuarter(-1, 1);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_showQuarter_3() {
        Conditions cond = new Conditions();
        String expected = "III quarter";
        String actual = cond.showQuarter(-1, -1);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_showQuarter_4() {
        Conditions cond = new Conditions();
        String expected = "IV quarter";
        String actual = cond.showQuarter(1, -1);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_showQuarter_5() {
        Conditions cond = new Conditions();
        String expected = "Your point between I and II quarter";
        String actual = cond.showQuarter(0, 1);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_showQuarter_6() {
        Conditions cond = new Conditions();
        String expected = "Your point between I and IV quarter";
        String actual = cond.showQuarter(1, 0);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_showQuarter_7() {
        Conditions cond = new Conditions();
        String expected = "Your point between II and III quarter";
        String actual = cond.showQuarter(-1, 0);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_showQuarter_8() {
        Conditions cond = new Conditions();
        String expected = "Your point between III and IV quarter";
        String actual = cond.showQuarter(0, -1);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_showQuarter_9() {
        Conditions cond = new Conditions();
        String expected = "Your point equals O:O";
        String actual = cond.showQuarter(0, 0);
        Assertions.assertEquals(expected, actual);
    }
//////////////////////////////_2nd_method_end_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////_3rd_method_start_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    public void test_getSum_1() {
        Conditions cond = new Conditions();
        int expected = 6;
        int actual = cond.getSum(1, 2, 3);
        Assertions.assertEquals(expected, actual);
    }
//////////////////////////////_3rd_method_end_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////_4th_method_start_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    public void test_countMax_1() {
        Conditions cond = new Conditions();
        int expected = 63;
        int actual = cond.countMax(2, 10, 3);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_countMax_2() {
        Conditions cond = new Conditions();
        int expected = 9;
        int actual = cond.countMax(1, 2, 3);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_countMax_3() {
        Conditions cond = new Conditions();
        int expected = 14;
        int actual = cond.countMax(-2, 10, 3);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_countMa_4() {
        Conditions cond = new Conditions();
        int expected = 16;
        int actual = cond.countMax(0, 10, 3);
        Assertions.assertEquals(expected, actual);
    }

//////////////////////////////_4th_method_end_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////_5th_method_start_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    public void testRating_1() {
        Conditions cond = new Conditions();
        String expected = "F";
        String actual = cond.rating(19);
        Assertions.assertEquals(expected, actual);
    }   @Test
    public void testRating_2() {
        Conditions cond = new Conditions();
        String expected = "E";
        String actual = cond.rating(39);
        Assertions.assertEquals(expected, actual);
    }   @Test
    public void testRating_3() {
        Conditions cond = new Conditions();
        String expected = "D";
        String actual = cond.rating(59);
        Assertions.assertEquals(expected, actual);
    }   @Test
    public void testRating_4() {
        Conditions cond = new Conditions();
        String expected = "C";
        String actual = cond.rating(74);
        Assertions.assertEquals(expected, actual);
    }   @Test
    public void testRating_5() {
        Conditions cond = new Conditions();
        String expected = "B";
        String actual = cond.rating(80);
        Assertions.assertEquals(expected, actual);
    }   @Test
    public void testRating_6() {
        Conditions cond = new Conditions();
        String expected = "A";
        String actual = cond.rating(99);
        Assertions.assertEquals(expected, actual);
    }
}
//////////////////////////////_testing_end_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\