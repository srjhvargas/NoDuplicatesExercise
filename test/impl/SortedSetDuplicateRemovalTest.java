package impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SortedSetDuplicateRemovalTest {
    DuplicateRemoval duplicateRemoval;
    private String input;
    private String expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return DataTestFactory.getDataSorted();
    }

    public SortedSetDuplicateRemovalTest(String input, String expected) {
        duplicateRemoval = new SortedSetDuplicateRemoval();
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testRemoveDuplicates() {
        assertEquals(expected, duplicateRemoval.removeDuplicates(input));
    }
}