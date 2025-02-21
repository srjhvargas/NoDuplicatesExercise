import impl.DuplicateRemoval;
import impl.SortedSetDuplicateRemoval;
import impl.RegexDuplicateRemoval;
import impl.StreamsDuplicateRemoval;

public class Main {

    public static final String EVAL_CAD = "AABBCCD112233";

    public static void main(String[] args) {
        DuplicateRemoval duplicateRemoval = new RegexDuplicateRemoval();

        System.out.println(duplicateRemoval.removeDuplicates(EVAL_CAD));
        System.out.println(duplicateRemoval.removeDuplicates(null));
        System.out.println(new SortedSetDuplicateRemoval().removeDuplicates(EVAL_CAD));
        System.out.println(new StreamsDuplicateRemoval().removeDuplicates(EVAL_CAD));

    }
}