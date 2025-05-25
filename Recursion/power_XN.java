import java.util.*;
class Main {
    public static int powXN(int x, int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return x * powXN(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(powXN(2,3));
    }
}
