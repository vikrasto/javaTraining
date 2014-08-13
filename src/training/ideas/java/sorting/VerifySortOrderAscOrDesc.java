package training.ideas.java.sorting;

/**
 * Created by idnvra on 06-08-2014.
 */
public class VerifySortOrderAscOrDesc {
    public enum sortOrder {ASC,DESC}
    public static boolean check(int lhs, int rhs, sortOrder sortOrder) {
        return sortOrder == sortOrder.ASC ? lhs>rhs : lhs < rhs;
    }
}
