import java.util.*;

class Main {
    static int[] moveZeroes(int [] nums)
    {
        int l = 0;
        int r = nums.length - 1;
        while(l < r)
        {
            if(nums[l] == 0)
            {
                while(l<r && nums[r] == 0)
                {
                    r--;
                }
                
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r--;
            }
            l++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {23, 56,0, 78,0, 78, 9992};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
