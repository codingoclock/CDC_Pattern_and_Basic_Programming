import java.util.*;
class Main {
    static boolean isarm(int n)
    {
        String s = Integer.toString(n);
        int m = s.length();
        int sum = 0;
        for(int i=0; i < s.length(); i++)
        {
            int digit = s.charAt(i) - '0';
            sum = sum + (int)Math.pow(digit,m);
        }
        if(sum != n)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isarm(153));
    }
}
