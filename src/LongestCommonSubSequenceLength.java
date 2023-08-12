import java.util.Arrays;

public class LongestCommonSubSequenceLength {
    public static void main(String[] args) {
        String x = "adbsitp";
        String y = "abspiret";
        int lenX = x.length();
        int lenY = y.length();

        int[][] dp = new int[lenX+1][lenY+1];
        initializeDP(dp, lenX, lenY);
        //fillArray(dp);
        //System.out.println("Ans: " + lcs(x, y, lenX, lenY));
        //System.out.println("Ans: " + lcsDp(x,y,lenX,lenY,dp));
        System.out.println("Ans: " + bottomUpDp(x, y, lenX, lenY, dp));
    }

    public static int lcs(String x, String y, int lengthX, int lengthY) {

        if(lengthX == 0 || lengthY == 0) {
            return 0;
        }

        if(x.charAt(lengthX - 1) == y.charAt(lengthY - 1)) {
            return 1 + lcs(x, y, lengthX - 1, lengthY - 1);
        }
        else {
            return Math.max(lcs(x, y, lengthX - 1, lengthY), lcs(x, y, lengthX, lengthY - 1));
        }
    }

    public static int lcsDp(String x, String y, int lengthX, int lengthY, int[][] dp) {

        if(lengthX == 0 || lengthY == 0) {
            return 0;
        }

        if(dp[lengthX][lengthY] != -1) {
            return dp[lengthX][lengthY];
        }

        if(x.charAt(lengthX - 1) == y.charAt(lengthY - 1)) {
            dp[lengthX][lengthY] = 1 + lcsDp(x, y, lengthX - 1, lengthY - 1, dp);
            return dp[lengthX][lengthY];
        }
        else {
            dp[lengthX][lengthY] = Math.max(lcsDp(x, y, lengthX - 1, lengthY, dp), lcsDp(x, y, lengthX, lengthY - 1, dp));
            return dp[lengthX][lengthY];
        }
    }

    public static int bottomUpDp(String x, String y, int lenX, int lenY, int[][] dp) {
        for(int i=1; i<lenX+1; i++) {
            for(int j=1; j<lenY+1; j++) {
                if(x.charAt(i-1) == y.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[lenX][lenY];
    }

    public static void fillArray(int[][] dp) {
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        return;
    }

    public static void initializeDP(int[][] dp, int lenX, int lenY) {
        int x = lenX + 1;
        int y = lenY + 1;

        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        return;
    }
}
