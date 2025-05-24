import java.util.*;
class Main {
    public static int evenOddMax(int [] nums)
    {
        int curr = 1;
        int max = 1;
        for(int i=1; i < nums.length; i++)
        {
            if(nums[i] % 2 == 0 && nums[i-1] % 2 != 0 || nums[i]%2 != 0 && nums[i-1]%2 == 0)
            {
                curr++;
                max = Math.max(max,curr);
            }
            else
            {
                curr = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] nums = {1,23,4,56,78,34,22,1,10,9};
        System.out.println(evenOddMax(nums));
    }
}
