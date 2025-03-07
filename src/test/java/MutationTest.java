import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.example.MutationExample;
import org.junit.jupiter.api.Test;

public class MutationTest {
    @Test
    void testEvenNumber() {
        MutationExample obj = new MutationExample();
        assertTrue(obj.isEven(4));
    }

    @Test
    void testOddNumber() {
        MutationExample obj = new MutationExample();
        assertFalse(obj.isEven(5));
    }
}
