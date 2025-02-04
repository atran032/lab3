import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed1() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, input1);
	}

  @Test 
	public void testReverseInPlace3() {
    int[] input1 = { 3, 4, 5, 4, 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3, 4, 5, 4, 3 }, input1);
	}

  @Test 
	public void testReversed2() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
	}

  @Test 
	public void testReversed3() {
    int[] input1 = { 1, 2, 3, 4, 0 };
    assertArrayEquals(new int[]{ 0, 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
	}

  @Test 
	public void testReversed4() {
    int[] input1 = { 0, 0, 0, 0 };
    assertArrayEquals(new int[]{ 0, 0, 0, 0 }, ArrayExamples.reversed(input1));
	}

  @Test
  public void testAverage() {
    double[] input1 = { 2, 2, 2, 1, 1, 2 };
    assertEquals(1.8, ArrayExamples.averageWithoutLowest(input1), 0);
  }
}
