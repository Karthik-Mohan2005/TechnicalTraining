import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AdditionTest {

    @Test
    void test() {
        assertEquals(5, Main.add(2,3));
    }

    @Test
    void testAdd() {
        assertEquals(100, Main.add(50,50));
    }
}