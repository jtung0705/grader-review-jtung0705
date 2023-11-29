import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  	//@Test 
	public void testReverseInPlace0() {
    int[] input1 = { 0 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{0}, input1);
	}
  //	@Test 
	public void testReverseInPlace3_7() {
    int[] input1 = { 3,5,6,7 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{7,6,5, 3 }, input1);
	} // failure inducing as a JUnit tests
}
