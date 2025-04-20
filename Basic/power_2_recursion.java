import java.util.*;
class Main {
    static int power(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else
        {
            return 2 * power(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(power(8));
    }
}
