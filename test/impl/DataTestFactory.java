package impl;

import java.util.Arrays;
import java.util.Collection;

public class DataTestFactory {

    public static Collection<Object[]> getData() {
        return Arrays.asList(new Object[][] {
                { null, null }, { "aaa", "a" }, { "", "" }, { "11aabbc", "1abc" }, { "AABBCCD112233", "ABCD123" }
        });
    }

    /**
     * Used in some scenarios where the data needs to be sorted.
     * @return
     */
    public static Collection<Object[]> getDataSorted() {
        return Arrays.asList(new Object[][] {
                { null, null }, { "aaa", "a" }, { "", "" }, { "11aabbc", "1abc" }, { "AABBCCD112233", "123ABCD" }
        });
    }
}
