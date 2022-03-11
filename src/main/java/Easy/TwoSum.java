package Easy;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class TwoSum {
    private static final Logger logger = LogManager.getLogger(TwoSum.class);

    public int[] twoSum(int[] nums, int target) {
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

    public static void main(String args[]) {
        BasicConfigurator.configure();

        TwoSum twoSum = new TwoSum();
        logger.info(Arrays.toString(twoSum.twoSum(new int[]{1,2,3}, 5)));
    }
}
