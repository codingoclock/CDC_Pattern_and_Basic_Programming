//A leader in an element that does not have any element greater than it on its right side.

import java.util.*;

class Main {
    static List<Integer> findLeaders(int [] nums)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int maxRight = nums[n - 1];
        list.add(maxRight);
        for(int i = n-2; i>=0; i--)
        {
            if(nums[i] > maxRight)
            {
                maxRight = nums[i];
                list.add(nums[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {23, 5600,0, 780,0, 78, 2};
        System.out.println(findLeaders(nums));
    }
}
