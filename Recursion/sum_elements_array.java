import java.util.*;
class Main {
    public static int sumElements(int [] nums, int index)
    {
        if(index >= nums.length){
            return 0;
        }
        
        return nums[index] + sumElements(nums,index+1);
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        System.out.println(sumElements(nums,0));
    }
}
