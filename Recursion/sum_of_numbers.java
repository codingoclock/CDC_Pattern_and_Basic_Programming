import java.util.*;
class Main {
    public static int sumnum(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        
        return n % 10 + sumnum(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(sumnum(1347));
    }
}
