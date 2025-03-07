import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.LoopExample;
import org.junit.jupiter.api.Test;

public class LoopTest {
    @Test
    void testZeroIterations() {
        LoopExample obj = new LoopExample();
        assertEquals(0, obj.sumUpTo(0)); // Bucle no se ejecuta
    }

    @Test
    void testOneIteration() {
        LoopExample obj = new LoopExample();
        assertEquals(1, obj.sumUpTo(1)); // Bucle se ejecuta una vez
    }

    @Test
    void testMultipleIterations() {
        LoopExample obj = new LoopExample();
        assertEquals(15, obj.sumUpTo(5)); // Bucle se ejecuta varias veces
    }
}

