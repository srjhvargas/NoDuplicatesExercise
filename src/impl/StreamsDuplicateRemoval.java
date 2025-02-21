package impl;

import java.util.Arrays;

public class StreamsDuplicateRemoval implements DuplicateRemoval {
    /**
     * Removes duplicate characters from the input string using streams collections implementation.
     * @param input to be checked
     * @return string without duplicate characters
     */
    public String removeDuplicates(String input) {
        return null == input ? null : Arrays
                .asList(input.split(""))
                .stream()
                .distinct().reduce("", (a, b) -> a + b);
    }
}
