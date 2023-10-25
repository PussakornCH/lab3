import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test 
	public void testListExamples() {
    List<String> list;
    StringChecker sc;
    int[] input1 = { 1, 2, 3 };
    ListExamples.filter(list, sc);
    assertArrayEquals(new int[]{ 3, 2, 1 }, ListExamples);
    }
}
