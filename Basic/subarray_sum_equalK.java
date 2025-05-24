import java.util.*;
class Main {
    public static boolean subarraySumK(int[] nums, int target) {
        int l = 0, r = 0, sum = 0;

        while (r < nums.length) {
            sum += nums[r];

            while (sum > target && l <= r) {
                sum -= nums[l];
                l++;
            }

            if (sum == target) {
                System.out.println("Subarray: " + l + " to " + r);
                return true;
            }

            r++;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1,23,4,56,78,34,22,1,10,9};
        System.out.println(subarraySumK(nums,42));
    }
}
