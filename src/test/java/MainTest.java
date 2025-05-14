import org.example.Main;
import org.example.StringCal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest{

    @Test
    void testEmptyString(){
        StringCal cal = new StringCal();

        assertEquals(cal.stringCalculator(""),0);
    }

    @Test
    void testOneNumberString(){
        StringCal cal = new StringCal();

        assertEquals(cal.stringCalculator("1"),1);
    }


}
