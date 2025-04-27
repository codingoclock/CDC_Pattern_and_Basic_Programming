import java.util.*;

class Main {
    static boolean isSorted(int [] arr)
    {
        for(int i=1; i < arr.length; i++)
        {
            if(arr[i] < arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] nums = {23,56,78,78,9992};
        System.out.println(isSorted(nums));
    }
}
