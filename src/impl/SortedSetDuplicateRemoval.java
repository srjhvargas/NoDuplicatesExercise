package impl;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDuplicateRemoval implements DuplicateRemoval {
    /**
     * Removes duplicate characters from the input string using sorted set implementation.
     * @param input to be checked
     * @return string without duplicate characters
     */
    public String removeDuplicates(String input) {
        if (null == input) return null;
        char [] array = input.toCharArray();
        SortedSet set = new TreeSet<String>();
        for (int i=0; i<array.length; i++) {
            set.add(array[i]);
        }
        Iterator iterator = set.iterator();
        StringBuffer buffer = new StringBuffer();
        while (iterator.hasNext()) {
            buffer.append(iterator.next());
        }
        return buffer.toString();
    }
}
