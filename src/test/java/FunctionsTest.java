import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionsTest {
    @Test
    public void testShowOfTheDayOfWeek(){
        Functions functions = new Functions();
        String expected = "Monday";
        String actual = functions.showDayOfTheWeek(7);
        assertEquals(expected,actual);
    }

    @Test
    public void convertTo_1000(){
        Functions functions = new Functions();
        String expected = "One hundred Twenty Three";
        String actual = functions.convertTo_1000(13);
        assertEquals(expected, actual);
    }
//    @Test
//    public void convertTo_1000000000000(){
//        Functions functions = new Functions();
//        String expected = "";
//        String actual = functions.convertTo_1000000000000(122);
//        assertEquals(expected,actual);
//    }
}
