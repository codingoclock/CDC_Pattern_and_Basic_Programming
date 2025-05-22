import java.util.*;
class Main {
    public static ArrayList<Integer> freqsorted(int [] nums)
    {
        int count = 1;
        ArrayList <Integer> freq = new ArrayList<>();
        int n = nums.length;
        for(int i=1; i < n; i++)
        {
            if(nums[i] == nums[i-1])
            {
                count++;
            }
            else
            {
                freq.add(count);
                count = 1;
            }
        }
        freq.add(count);
        return freq;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3,3,4,4,4,5,5};
        int n = nums.length;
        System.out.println(freqsorted(nums));
    }
}
