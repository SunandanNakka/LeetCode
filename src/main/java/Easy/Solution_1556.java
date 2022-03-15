package Easy;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/* 1556. Thousand Separator

    Given an integer n, add a dot (".") as the thousands separator and return it in string format.
 */
public class Solution_1556 {

    private static final Logger logger = LogManager.getLogger(Solution_1572.class);

    private String thousandSeparator(int n) {
        String numString = n + "";
        int strLen = numString.length();
        int count = 0;

        for (int i = strLen; i > 3; i -= 3) {
            numString = numString.substring(0, i - 3) + "." + numString.substring(i - 3, strLen + count);
            count++;
        }

        return numString;
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Solution_1556 solution = new Solution_1556();
        logger.info(solution.thousandSeparator(123450002));
    }
}
