import java.util.Arrays;
import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,3,2};
        System.out.println("Answer: " + singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        HashSet<Integer> hs = new HashSet();

        for(int i=0; i<nums.length; i++) {
            if(hs.contains(nums[i])) {
                hs.remove(nums[i]);
                continue;
            }
            hs.add(nums[i]);
        }

        return hs.stream().findFirst().get();
    }
}
