public class Knapsack {

    public static void main(String[] args) {
        // weight[] and value[] and max weight of a Knapsack given. Find Max Profit.
        int[] wt = {1,3,5};
        int[] val = {1,4,8};
        int length = wt.length;
        int w = 3;
        int[][] dp = new int[length+1][w+1];
        fill(dp);

        System.out.println("Ans: " + knapsackDP(wt, val, w, length, dp));
    }

    public static int knapsackDP(int[] wt, int[] value, int w, int n, int[][] dp) {
        // size of the wt array
        if(n == 0 || w == 0) {
            return 0;
        }

        if(dp[n][w] != -1){
            return dp[n][w];
        }

        if(wt[n-1] <= w) {
            dp[n][w] = Math.max(value[n-1] + knapsackDP(wt, value, w-wt[n-1], n-1, dp),
                    knapsackDP(wt, value, w, n-1, dp));
            return dp[n][w];
        }
        // wt[n-1] > w
        else {
            dp[n][w] = knapsackDP(wt, value, w, n-1, dp);
            return dp[n][w];
        }
    }

    public static int knapsack(int[] wt, int[] value, int w, int n) {
        // size of the wt array
        if(n == 0 || w == 0) {
            return 0;
        }

        if(wt[n-1] <= w) {
            return Math.max(value[n-1] + knapsack(wt, value, w-wt[n-1], n-1),
                    knapsack(wt, value, w, n-1));
        }
        // wt[n-1] > w
        else {
            return knapsack(wt, value, w, n-1);
        }
    }

    private static void fill(int[][] array) {
        int row = array.length;
        int column = array[0].length;

        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                array[i][j] = -1;
            }
        }

        return;
    }
}
