import java.util.*;
class Main {
    public static int productArray(int [] nums,int index)
    {
        if(index == nums.length){
            return 1;
        }
        
        return nums[index] * productArray(nums,index+1);
        
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(productArray(nums,0));
    }
}
