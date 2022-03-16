package Easy;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/* 1380. Lucky Numbers in a Matrix

    Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
    A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
 */
public class Solution_1380 {

    private static final Logger logger = LogManager.getLogger(Solution_1380.class);

    private List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<Integer>();

        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        boolean isLuckyNumber = true;

        int minElement;

        for (int i = 0; i < rowLength; i++) {
            isLuckyNumber = true;

            minElement = matrix[i][0];
            int colIndex = 0;

            for (int j = 0; j < colLength; j++) {
                if (minElement > matrix[i][j]) {
                    minElement = matrix[i][j];

                    colIndex = j;
                }
            }

            for (int k = 0; k < rowLength; k++) {
                if (minElement < matrix[k][colIndex]) {
                    isLuckyNumber = false;
                }
            }

            if (isLuckyNumber) {
                luckyNumbers.add(minElement);
            }
        }

        return luckyNumbers;
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Solution_1380 solution = new Solution_1380();
        logger.info(solution.luckyNumbers(new int[][]{new int[]{1,10,4,2}, new int[]{9,3,8,7}, new int[]{15,16,17,12}}));
    }
}
