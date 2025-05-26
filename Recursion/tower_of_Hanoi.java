import java.util.*;
class Main {
    public static void ToH(int n, char A, char B, char C)
    {
        if(n == 0) return;
        
        ToH(n-1,A,C,B);
        System.out.println(n + "from" + A + "to" + C);
        ToH(n-1,B,A,C);
        
    }
    public static void main(String[] args) {
        ToH(3,'A','B','C');
    }
}
