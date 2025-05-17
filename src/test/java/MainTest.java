import org.example.Main;
import org.example.StringCal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void handleNegativeNumbersThrowException() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> cal.stringCalculator("1\n-2,-3") );
        System.out.println(exception.getMessage());
        assertTrue(exception.getMessage().contains("-2,-3"));
    }

    @Test
    void handleDelimiterConfiguration() {
        assertEquals(cal.stringCalculator("//;\n2;3"),5);
        assertEquals(cal.stringCalculator("//::\n4::5\n3"),12);
    }

    @Test
    void handleAnyLengthDelimiter(){
        assertEquals(cal.stringCalculator("//[***]\n1***2***3"),6);
    }

    @Test
    void avoidNoMoreThan1000(){
        assertEquals(cal.stringCalculator("//[***]\n1***1001***3"),4);
    }

    @Test
    void handleAnyNoOfDelimiter(){
        assertEquals(cal.stringCalculator("//[*][#]\n1*1001#3"),4);
    }

    @Test
    void handleAnyNoOfDelimiterofAnyLength(){
        assertEquals(cal.stringCalculator("//[***][##]\n3***1001##6"),9);
    }


}
