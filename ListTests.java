import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTests {
    @Test
    public void testMerge1() {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a", "c"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("b", "c"));
        assertArrayEquals(new String[]{"a", "b", "c", "d"}, ListExamples.merge(list1, list2).toArray());
    }
}
