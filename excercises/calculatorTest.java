package excercises;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class calculatorTest {
    @Test
    public void testAdd() {
        assertEquals(calculator.add(1, 2, 3, 4, 5), 15);
    }

}
