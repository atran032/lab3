import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

public class ListTests {
    @Test
    public void testMerge1() {
        List<String> list1 = Arrays.asList("a", "c");
        List<String> list2 = Arrays.asList("b", "c");
        assertArrayEquals(new String[]{"a", "b", "c", "d"}, ListExamples.merge(list1, list2).toArray());
    }
    @Test
    public void testMerge2() {
        List<String> list1 = Arrays.asList("a", "b");
        List<String> list2 = Arrays.asList("c", "d");
        assertArrayEquals(new String[]{"a", "b", "c", "d"}, ListExamples.merge(list1, list2).toArray());
    }
    @Test
    public void testMerge3() {
        List<String> list1 = Arrays.asList("a", "c", "e");
        List<String> list2 = Arrays.asList("b", "d", "f");
        assertArrayEquals(new String[]{"a", "b", "c", "d", "e", }, ListExamples.merge(list1, list2).toArray());
    }
}
