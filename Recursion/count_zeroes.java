import java.util.*;
class Main {
    public static int countZeroes(String s,int index)
    {
        if(index == s.length()){
            return 0;
        }
        
        char ch = s.charAt(index);
        
        if(ch == '0'){
            return 1 + countZeroes(s,index+1);
        }else{
            return countZeroes(s,index+1);
        }
        
        
    }
    public static void main(String[] args) {
        String s = "10450";
        System.out.println(countZeroes(s,0));
    }
}
