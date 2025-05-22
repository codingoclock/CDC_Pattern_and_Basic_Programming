import java.util.*;
class Main {
    public static void reverse(int [] nums, int start, int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
    public static void main(String[] args) {
        int [] nums = new int []{1,2,3,4,5,6,7,8,9};
        int d = 5;
        int n = nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,d-1);
        reverse(nums,d,n-1);
        System.out.println(Arrays.toString(nums));
    }
}
