package Easy;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/* 1346. Check If N and Its Double Exist

    Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 */
public class Solution_1346 {
    private static final Logger logger = LogManager.getLogger(Solution_1346.class);

    private boolean checkIfExist(int[] arr) {
        int indexNum;

        for (int i = 0; i < arr.length; i++) {
            indexNum = arr[i];

            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[j] == 2 * indexNum)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Solution_1346 solution = new Solution_1346();
        logger.info(solution.checkIfExist(new int[]{10,2,5,3}));
    }
}
