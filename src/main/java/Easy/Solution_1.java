package Easy;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;

/* 1. Two Sum

    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
*/
public class Solution_1 {
    private static final Logger logger = LogManager.getLogger(Solution_1.class);

    private int[] twoSum(int[] nums, int target) {
        int[] answer = {0,1};
        int arrayLen = nums.length;

        if (arrayLen == 2) {
            return answer;
        } else {
            int index = -1;

            outerLoop:
            for (index = 0; index < arrayLen; index++) {
                int firstElement = nums[index];

                for (int jndex = index + 1; jndex < arrayLen; jndex++ ) {
                    if ((firstElement + nums[jndex]) == target) {
                        answer[0] = index;
                        answer[1] = jndex;
                        break outerLoop;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Solution_1 solution = new Solution_1();
        logger.info(Arrays.toString(solution.twoSum(new int[]{1,2,3}, 5)));
    }
}
