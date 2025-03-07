import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(3, 2));
    }
}
