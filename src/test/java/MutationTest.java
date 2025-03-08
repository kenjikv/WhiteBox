import org.example.MutationExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
