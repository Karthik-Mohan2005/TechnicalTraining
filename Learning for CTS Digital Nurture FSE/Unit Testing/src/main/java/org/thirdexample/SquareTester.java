package org.thirdexample;
import org.junit.*;
import static org.junit.Assert.*;
public class SquareTester {
    Square a = new Square();
    @Test
    public void squareTester(){
        assertEquals(49,a.square(7));
    }
    @Test
    public void square5tester(){
        assertEquals(25,a.square(5));
    }
    @Test
    public void square0Tester(){
        assertEquals(0,a.square(0));
    }
}
