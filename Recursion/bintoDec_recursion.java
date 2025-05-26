import java.util.*;
class Main {
    public static int bintoDec(String s, int index)
    {
        if(index == s.length()) return 0;
        
        int bit = s.charAt(index) - '0';
        int power = s.length() - 1 - index;
        
        return (bit * (int)Math.pow(2,power)) + bintoDec(s,index+1);
        
    }
    public static void main(String[] args) {
        String s = "101";
        System.out.println(bintoDec(s,0));
    }
}
