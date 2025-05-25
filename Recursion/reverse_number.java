import java.util.*;
class Main {
    public static String countDigit(int n,StringBuilder sb)
    {
        if(n == 0 && sb.length() > 0)
        {
            return sb.toString();
        }
        
        sb.append(n % 10);
        
        return countDigit(n/10,sb);
    }
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();
        System.out.println(countDigit(5890,res));
    }
}
