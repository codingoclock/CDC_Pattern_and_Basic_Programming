import java.util.*;
class Main {
    public static boolean checkPalin(String s, int start, int end)
    {
        if(start >= end)
        {
            return true;
        }
        if(s.charAt(start) != s.charAt(end))
        {
            return false;
        }
        
        return checkPalin(s,start+1,end-1);
    }
    public static void main(String[] args) {
        String s = "hellsleh";
        System.out.println(checkPalin(s,0,s.length() - 1));
    }
}
