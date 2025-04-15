import java.util.*;
class Main {
    static int sum = 0;
    static int sum(int n)
    {
        if(n == 0)
        {
            return sum;
        }
        
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
