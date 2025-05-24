import java.util.*;
class Main {
    public static int maxone(int [] nums)
    {
        int max = 0;
        int count = 0;
        int n = nums.length;
        int l = 0;
        while(l < n)
        {
           if(nums[l] == 1)
           {
               count++;
           }
           else
           {
               if(count > max)
               {
                   max = count;
               }
               count = 0;
           }
           l++;
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,0,0,1,1,1};
        System.out.println(maxone(nums));
    }
}
