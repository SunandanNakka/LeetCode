package Easy;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/* 1323. Maximum 69 Number

    You are given a positive integer num consisting only of digits 6 and 9.
    Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
*/
public class Solution_1323 {
    private static final Logger logger = LogManager.getLogger(Solution_1323.class);

    private int maximum69Number(int num) {
        String numStr = num + "";
        StringBuilder ansStr = new StringBuilder();
        boolean flag = false;

        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '6' && !flag) {
                ansStr.append('9');
                flag = true;
            } else {
                ansStr.append(numStr.charAt(i));
            }
        }

        return Integer.parseInt(ansStr.toString());
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Solution_1323 solution = new Solution_1323();
        logger.info(solution.maximum69Number(9699));
    }
}
