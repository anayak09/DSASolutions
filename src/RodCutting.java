public class RodCutting {
    public static void main(String[] args) {

        // Given a rod of Length "len", and a price[] corresponding to the length[],
        // find max profit when you cut a rod.
//        int[] length = {1,2,3,4,5,6};  // wt[]
//        int[] price = {3,5,7,2,8,7};   // val[]
//        int len = 6;                   // W

        int[] length = {1,2,3,4,5,6,7,8};  // wt[]
        int[] price = {1,5,8,9,10,17,17,20};   // val[]
        int len = 8;                   // W

        // sometimes the whole length[] is not given, so the "length" of array varies.
        // sometimes it (len == length.length) will be the same.
        int[][] dp = new int[length.length + 1][len+1];

//        for(int i=0; i<length.length+1; i++) {
//            for(int j=0; j<len+1; j++) {
//                if(i == 0 || j == 0) {
//                    dp[i][j] = 0;
//                }
//            }
//        }

        for(int i=0; i<length.length+1; i++) {
            for(int j=0; j<len+1; j++) {
                dp[i][j] = -1;
            }
        }

        //System.out.println("Ans: " + unboundedKnapsack(length, price, len, dp));
        System.out.println("Ans: " + unboundedKnapsackRecursive(length, price, len, dp, length.length));
    }

    public static int unboundedKnapsack(int[] length, int[] price, int len, int[][] dp) {

        for(int i=1; i<length.length+1; i++) {
            for(int j=1; j<len+1; j++) {
                if(length[i-1] <= j) {
                    dp[i][j] = Math.max((price[i-1] + dp[i][j-length[i-1]]),
                                            dp[i-1][j]);
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[length.length][len];
    }

    public static int unboundedKnapsackRecursive(int[] length, int[] price, int len, int[][] dp, int index) {

        if(len == 0 || index == 0) {
            return 0;
        }

        if(dp[index-1][len] != -1) {
            return dp[index-1][len];
        }

        if(length[index - 1] <= len) {
           return dp[index - 1][len] = Math.max((price[index-1] + unboundedKnapsackRecursive(length, price, len-length[index-1], dp, index)),
                                            unboundedKnapsackRecursive(length, price, len, dp,index-1));
        }
        else {
           return dp[index - 1][len] = unboundedKnapsackRecursive(length, price, len, dp,index-1);
        }
    }
}
