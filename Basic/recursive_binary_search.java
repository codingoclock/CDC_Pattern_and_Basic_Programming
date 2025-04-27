class Main {
    static int binarysearch(int [] arr, int low, int high, int x)
    {
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(arr[mid] == x)
            {
                return mid;
            }
            else if (arr[mid] > x)
            {
                return binarysearch(arr,low,mid-1,x);
            }
            else
            {
                return binarysearch(arr,mid+1,high,x);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {1,4,5,8,90,100};
        System.out.println(binarysearch(nums,0,nums.length -1,100));
    }
}
