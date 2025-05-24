import java.util.*;
class Main {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int m : nums)
        {
            map.put(m , map.getOrDefault(m,0) + 1);
        }
        for(int i : map.keySet())
        {
            if(map.get(i) > n/2){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {3,2,3,4,5,6,3,3,3};
        System.out.println(majorityElement(nums));
    }
}
