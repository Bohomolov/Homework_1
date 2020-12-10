import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionsTest {
    Functions functions = new Functions();
    @Test
    public void convertTo_1000(){
        String expected = "One hundred Twenty Three";
        String actual = functions.convertTo_1000(123);
        assertEquals(expected, actual);
    }
    @Test
    public void convertTo_1000000000000(){
        String expected = "";
        String actual = functions.convertTo_1000000000000(923456789l);
        assertEquals(expected,actual);
    }
}
