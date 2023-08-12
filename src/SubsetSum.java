public class SubsetSum {
    public static void main(String[] args) {
        // Array is given and a Target Sum "t" is given - Need to tell if there exists a sub-array with Sum = t
            int[] nums = {3,4};
        int len = nums.length;
        int sum = 7;
        boolean[][] visited = new boolean[len+1][sum+1];

        for(int i=0; i<len+1; i++) {
            for(int j=0; j<sum+1; j++) {
                if(i == 0) {
                    visited[i][j] = false;
                }
                if(j == 0) {
                    visited[i][j] = true;
                }
            }
        }

        System.out.println("Ans: " + subsetSum(nums, sum, len, visited));
    }

    public static boolean subsetSum(int[] nums, int sum, int len, boolean[][] visited) {

        for(int i=1; i<len+1; i++) {
            for(int j=1; j<sum+1; j++) {
                if(nums[i-1] > j) {
                    visited[i][j] = visited[i-1][j];
                }
                if(nums[i-1] <= j) {
                    visited[i][j] = visited[i-1][j-nums[i-1]] || visited[i-1][j];
                }
            }
        }

        return visited[len][sum];
    }
}
