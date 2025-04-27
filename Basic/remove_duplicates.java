import java.util.*;

class Main {
    static int[] removeDuplicates(int[] nums) {
        int[] res = new int[nums.length];
        int l = 0; 

        res[l++] = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { 
                res[l++] = nums[i];
            }
        }
        return Arrays.copyOf(res, l);
    }

    public static void main(String[] args) {
        int[] nums = {23, 56, 78, 78, 9992};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }
}
