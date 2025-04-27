import java.util.*;

class Main {
    static int [] reverseArray(int [] nums)
    {
        int [] res = new int [nums.length];
        int l = 0;
        int r = nums.length - 1;
        while(r >= 0)
        {
            res[l] = nums[r];
            r--;
            l++;
        }
        return res;
    }
    public static void main(String[] args) {
        int [] nums = {23,56,78,78,9992};
        System.out.println(Arrays.toString(reverseArray(nums)));
    }
}
