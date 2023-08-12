import java.util.ArrayList;
import java.util.List;

public class MinSubsetSumDiff {
    public static void main(String[] args) {
        int[] nums = {1,2,7};

        System.out.println("Ans: " + minDiffSubsetSum(nums));
    }

    private static int minDiffSubsetSum(int[] nums) {
        int sum = 0;
        int len = nums.length;

        for(int i=0; i<len; i++) {
            sum = sum + nums[i];
        }

        boolean[][] dp = new boolean[len+1][sum+1];

        for(int i=0; i<len+1; i++) {
            for(int j=0; j<sum+1; j++) {
                if(i == 0) {
                    dp[i][j] = false;
                }
                if(j == 0) {
                    dp[i][j] = true;
                }
            }
        }

        // fill the dp tabulation
        subsetSum(nums, sum, len, dp);

        // Range of subset sum -- ( 0, sum ) --> {} empty subset to Full array
        // Subset sums are 'S1' and 'S2'.
        // S2 - S1 = diff (minimize the diff)
        // S1 + S2 = sum      =>       S2 = sum - S1
        // S2 - S1 = sum - 2*S1 --> So I need to find only one Subset sum.

        List<Integer> probableSums = new ArrayList<>();

        for(int j=0; j<(sum+1)/2; j++) {
            if(dp[len][j]) {
                probableSums.add(j);
            }
        }

        int min = Integer.MAX_VALUE;

        for (int ps : probableSums) {
            min = Math.min(min, (sum - 2*ps));
        }

        return min;
    }

    public static void subsetSum(int[] nums, int sum, int len, boolean[][] dp) {

        for(int i=1; i<len+1; i++) {
            for(int j=1; j<sum+1; j++) {
                if(nums[i-1] <= j) {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return;
    }
}
