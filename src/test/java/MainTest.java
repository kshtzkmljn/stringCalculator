import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest{

    @Test
    void testEmptyString(){
        Main main = new Main();

        assertEquals(main.stringCalculator(""),0);
    }


}
