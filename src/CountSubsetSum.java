public class CountSubsetSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,8,10};
        int len = nums.length;
        int sum = 10;

        // dp[i][j] -> No of subsets possible with "i" number of elements and "j" sum
        int[][] dp = new int[len+1][sum+1];

        for(int i=0; i<len+1; i++) {
            for(int j=0; j<sum+1; j++) {
                if(i == 0) {
                    // with no elements in the array, you cant achieve any sum (except sum 0.)
                    dp[i][j] = 0;
                }
                if(j == 0) {
                    // can achieve 0 sum subset with any no of elements -> because {} is also a subset
                    dp[i][j] = 1;
                }
            }
        }

        System.out.println("Ans: " + count(nums, sum, len, dp));
    }

    private static int count(int[] nums, int sum, int len, int[][] dp) {

        for(int i=1; i<len+1; i++) {
            for(int j=1; j<sum+1; j++) {
                if(nums[i-1] <= j) {
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[len][sum];
    }
}
