import java.util.*;
class Main {
    static int count = 0;
    static boolean prime(int n)
    {
        for(int i=2; i <= n; i++)
        {
            if(n % i == 0)
            {
                count++;
            }
        }
        if(count == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(prime(13)); //Prime
        //Since, every number is divisible by 1, any prime number should be divisible only by 
        //itself, hence check if count is one or not.
    }
}
