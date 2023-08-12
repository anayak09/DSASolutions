public class BinarySearch {

    public int searchAlgo(int[] nums, int target) {
        //int[] nums = {1,2,3,4,5,6,7,8};
        //int target = 7;
        int left = 0;
        int right = nums.length - 1;
        // find index of 7

        while (left < right) {
            int k = (left + right) /2;
            if(nums[k] == target){
                return k;
            }
            else if (nums[k] < target) {
                left = k;
            }
            else {
                right = k;
            }
        }
        if((left == right) && nums[left] == target) {
            return left;
        }
        return -1;
    }
}
