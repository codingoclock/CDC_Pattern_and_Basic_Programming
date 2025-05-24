import java.util.*;
class Main {
    public static int subsumsizek(int [] nums, int k)
    {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(r < n)
        {
            sum += nums[r];
            while(r - l + 1 > k)
            {
                sum -= nums[l];
                l++;
            }
            max = Math.max(max,sum);
            r++;
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums = {1,23,4,56,78,34,22,1,10,9};
        System.out.println(subsumsizek(nums,3));
    }
}
