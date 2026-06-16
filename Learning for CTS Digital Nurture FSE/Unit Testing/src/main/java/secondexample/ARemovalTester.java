package secondexample;
import org.junit.*;
import static org.junit.Assert.*;
public class ARemovalTester {
    ARemoval a = new ARemoval();
    @Test
    public void aRemovalTest(){
        assertEquals("B",a.removal("AB"));
    }
    @Test
    public void aremovalTest(){
        assertEquals("B",a.removal("AAB"));
    }
    @Test
    public void A2RemovalTest(){
        assertEquals("BCD",a.removal("ABCD"));
    }
    @Test
    public void ANothingremovalTest(){
        assertEquals("BBAA",a.removal("AABBAA"));
    }
    @Test
    public void AemptyremovalTest(){
        assertEquals("",a.removal(""));
    }
    @Test
    public void A0removalTest(){
        assertEquals("",a.removal("AA"));
    }
    @Test
    public void AcharremovalTest(){
        assertEquals("",a.removal("A"));
    }
}
