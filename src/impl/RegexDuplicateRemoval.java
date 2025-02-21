package impl;

public class RegexDuplicateRemoval implements DuplicateRemoval {
    /**
     * Removes duplicate characters from the input string using regex implementation.
     * @param input to be checked
     * @return string without duplicate characters
     */
    public String removeDuplicates(String input) {
        return null == input ? null : input.replaceAll("(.)\\1+", "$1");
    }
}
