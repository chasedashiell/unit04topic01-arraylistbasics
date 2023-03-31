import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayListUtilitiesTest {
    @Test
    public void testGetListMax() {
        ArrayList<Integer> input;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList(1, 5, 4, 9, 2, 1));
        expectedOutput = 9;
        actualOutput = ArrayListUtilities.getListMax(input);
        assertEquals(expectedOutput, actualOutput);

        
    }
    @Test
    public void testWithoutLongWords(){
            ArrayList<String> input;
            ArrayList<String> expectedOutput;
            ArrayList<String> actualOutput;

            input = new ArrayList<>(Arrays.asList("hello", "my", "name", "is", "theGingerBreadMan"));
            expectedOutput = new ArrayList<>(Arrays.asList("hello", "my", "name", "is"));
            actualOutput = ArrayListUtilities.withoutLongWords(input);
            assertEquals(expectedOutput, actualOutput);

    }
    @Test
    public void testRemoveLongWords(){
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;

        input = new ArrayList<>(Arrays.asList("hello", "my", "name", "is", "theGingerBreadMan"));
        expectedOutput = new ArrayList<>(Arrays.asList("hello", "my", "name", "is"));
        ArrayListUtilities.removeLongWords(input);
        actualOutput = input;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test 
    public void testReversed(){
        ArrayList<Double> input;
        ArrayList<Double> expectedOutput;
        ArrayList<Double> actualOutput;

        input = new ArrayList<>(Arrays.asList(1.0, 2.6, 1.3, 6.4, 0.6));
        expectedOutput = new ArrayList<>(Arrays.asList(0.6, 6.4, 1.3, 2.6, 1.0));
        actualOutput = ArrayListUtilities.reversed(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseInPlace(){
        ArrayList<Double> input;
        ArrayList<Double> expectedOutput;
        input = new ArrayList<>(Arrays.asList(1.0, 2.6, 1.3, 6.4, 0.6));
        expectedOutput = new ArrayList<>(Arrays.asList(0.6, 6.4, 1.3, 2.6, 1.0));
        ArrayListUtilities.reverseInPlace(input);
        assertEquals(expectedOutput, input);
    }

}
