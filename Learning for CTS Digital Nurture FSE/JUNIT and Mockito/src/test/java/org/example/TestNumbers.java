package org.example;
import org.junit.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;

public class TestNumbers {
    @ParameterizedTest
    @ValueSource(chars={1,2,3,4,5,6,7,8,9})
    void testNumbers(char n){
        assertTrue(n>0);
    }
}
