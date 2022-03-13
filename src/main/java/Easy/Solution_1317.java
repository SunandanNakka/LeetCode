package Easy;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;

/* 1317. Convert Integer to the Sum of Two No-Zero Integers

    No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.
    Given an integer n, return a list of two integers [A, B] where:
    A and B are No-Zero integers.
    A + B = n
    The test cases are generated so that there is at least one valid solution. If there are many valid solutions you can return any of them.
*/
public class Solution_1317 {
    private static final Logger logger = LogManager.getLogger(Solution_1317.class);

    private int[] getNoZeroIntegers(int n) {
        int first = n/2;
        int second = n - first;
        int count = 1;

        while (!isNonZeroInteger(first) || !isNonZeroInteger(second)) {
            first = first + count;
            second = second - count;
            count++;
        }

        int[] ans = new int[2];
        ans[0] = first;
        ans[1] = second;

        return ans;
    }

    private boolean isNonZeroInteger(int num) {
        while (num > 0) {
            if ((num % 10) == 0) {
                return false;
            }

            num = num / 10;
        }

        return true;
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Solution_1317 solution = new Solution_1317();
        logger.info(Arrays.toString(solution.getNoZeroIntegers(100)));
    }
}
