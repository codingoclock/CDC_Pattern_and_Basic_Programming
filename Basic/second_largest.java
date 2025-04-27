import java.util.*;

class Main {
    static int secondlargest(int [] nums)
    {
        Arrays.sort(nums);
        return nums[nums.length -2];
    }
    public static void main(String[] args) {
        int [] nums = {23,56,78,19999,9992};
        System.out.println(secondlargest(nums));
    }
}
