package org.example;
import org.junit.Test;
import org.junit.Assert.*;
import static org.junit.Assert.*;
public class SwapTester {
    @Test
    public void testStrWithCharsReversed(){
        StringHelper a = new StringHelper();
        assertEquals("AB",a.swap("BA"));
    }
}
