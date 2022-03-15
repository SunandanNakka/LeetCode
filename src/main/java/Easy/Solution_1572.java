package Easy;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/* 1572. Matrix Diagonal Sum

    Given a square matrix mat, return the sum of the matrix diagonals.
    Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal
    that are not part of the primary diagonal.
 */
public class Solution_1572 {

    private static final Logger logger = LogManager.getLogger(Solution_1572.class);

    private int diagonalSum(int[][] mat) {
        int arrayLen = mat.length;
        int centerRow = arrayLen / 2;

        int diagonalSum = 0;

        for (int i = 0; i < arrayLen; i++) {
            diagonalSum += mat[i][i];
        }

        for (int i = 0, k = arrayLen - 1; i < arrayLen && k >= 0; i++, k--) {
            if ((i != centerRow) || (k != centerRow)) {
                diagonalSum += mat[i][k];
            }
        }

        return diagonalSum;
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Solution_1572 solution = new Solution_1572();
        logger.info(solution.diagonalSum(new int[][]{new int[]{10,2,5,3}, new int[]{1,1,1,2}, new int[]{1,1,1,2}}));
    }
}
