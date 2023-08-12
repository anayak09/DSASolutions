public class CoinChangeNoOfWays {
    public static void main(String[] args) {
        int[] coin = {1,2,5};
        int sum = 5;

        int[][] dp = new int[coin.length + 1][sum+1];

        for (int i=0; i<coin.length+1; i++) {
            for(int j=0; j<sum+1; j++) {
                if(i == 0) {
                    dp[i][j] = 0;
                }
                if(j == 0) {
                    dp[i][j] = 1;
                }
            }
        }

        System.out.println("Ans: " + coinChange(coin, sum, coin.length, dp));
    }

    public static int coinChange(int[] coin, int sum, int len, int[][] dp) {

        for (int i=1; i<len+1; i++) {
            for(int j=1; j<sum+1; j++) {
                if(coin[i-1] <= j) {
                    dp[i][j] = dp[i][j-coin[i-1]] + dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[len][sum];
    }
}
