import org.example.Main;
import org.example.StringCal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest{
    StringCal cal = new StringCal();
    @Test
    void testEmptyString(){
        assertEquals(cal.stringCalculator(""),0);
    }

    @Test
    void testOneNumberString(){
        assertEquals(cal.stringCalculator("1"),1);
    }

    @Test
    void testAddingTwoNumbers(){
        assertEquals(cal.stringCalculator("1,2"),3);
    }

    @Test
    void handleNewLineBetweenTwoNum(){
        assertEquals(cal.stringCalculator("1\n2,3"),6);
    }


}
