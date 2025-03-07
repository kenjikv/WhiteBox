import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.ControlFlowExample;
import org.junit.jupiter.api.Test;

public class ControlFlowTest {
    @Test
    void testPositive() {
        ControlFlowExample obj = new ControlFlowExample();
        assertEquals("Positive", obj.checkNumber(10));
    }

    @Test
    void testNegative() {
        ControlFlowExample obj = new ControlFlowExample();
        assertEquals("Negative", obj.checkNumber(-5));
    }

    @Test
    void testZero() {
        ControlFlowExample obj = new ControlFlowExample();
        assertEquals("Zero", obj.checkNumber(0));
    }
}
