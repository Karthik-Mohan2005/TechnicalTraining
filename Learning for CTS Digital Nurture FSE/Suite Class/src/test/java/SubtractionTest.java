import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionTest {

    @Test
    void testSub() {
        assertEquals(2, Main.diff(5,3));
    }

    @Test
    void testSub2() {
        assertEquals(0, Main.diff(10,10));
    }
}