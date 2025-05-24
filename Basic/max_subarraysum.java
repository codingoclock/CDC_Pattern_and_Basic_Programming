import java.util.*;
class Main {
    public static int maxsubarraysum(int [] nums)
    {
        int curr = nums[0];
        int max = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            curr = Math.max(nums[i] , curr + nums[i]);
            max = Math.max(curr,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums = {1,23,4,56,78,34,22,1,10,9};
        System.out.println(maxsubarraysum(nums));
    }
}
