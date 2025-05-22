import java.util.*;
class Main {
    public static int maxdiff(int [] nums)
    {
        int max = Integer.MIN_VALUE;
        for(int i=1; i < nums.length; i++)
        {
            int diff = nums[i] - nums[i-1];
            if(diff > max)
            {
                max = diff;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums = new int []{1,2,3,4,5,9,10,11,12};
        int n = nums.length;
        System.out.println(maxdiff(nums));
    }
}
