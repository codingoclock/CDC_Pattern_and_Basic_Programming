import java.util.*;
class Main {
    public static String dectoBin(int s)
    {
        if(s == 0){
            return "";
        }
        
        return dectoBin(s/2) + (s%2); 
        
        
    }
    public static void main(String[] args) {
        int s = 10;
        String sb = dectoBin(10);
        System.out.println(sb);
    }
}
