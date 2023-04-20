import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test
    public void testMerge() {
        String[] input1 = {"hello", "hi"};
        String[] input2 = {"hey", "Greetings"};
        assertEquals({"hello", "hi", "hey", "Greetings"}, ListExamples.merge(input1, input2));
    }
}
