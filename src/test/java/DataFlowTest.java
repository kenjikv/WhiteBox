import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.DataFlowExample;
import org.junit.jupiter.api.Test;

public class DataFlowTest {
    @Test
    void testMultiply() {
        DataFlowExample obj = new DataFlowExample();
        assertEquals(20, obj.multiply(4, 5));
    }
}
