public class LongestCommonSubStringLength {
    public static void main(String[] args) {
        String x = "abcgtrweyu";
        String y = "abcfjweyuwd";
        int lenX = x.length();
        int lenY = y.length();

        int[][] dp = new int[lenX+1][lenY+1];
        System.out.println("Ans: " + lcSubstringLength(x, y, lenX, lenY, dp));
    }

    public static int lcSubstringLength(String x, String y, int lenX, int lenY, int[][] dp) {
        int max = 0;

        for (int i=1; i<lenX+1; i++) {
            for(int j=1; j<lenY+1; j++) {
                if(x.charAt(i-1) == y.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                    max = Math.max(dp[i][j], max);
                }
                else {
                    dp[i][j] = 0;
                }
            }
        }

        return max;
    }

    public static void initializeDP(int[][] dp, int lenX, int lenY) {
        for (int i=0; i<lenX+1; i++) {
            for(int j=0; j<lenY+1; j++) {
                if(i==0 || j==0) {
                    dp[i][j] = 0;
                }
            }
        }
    }
}
