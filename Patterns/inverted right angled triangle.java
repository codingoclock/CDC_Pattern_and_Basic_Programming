import java.util.*;

class Solution {
    static void invertedrtriangle(int r, int c)
    {
        if (r==0) return;
        if(c < r)
        {
            System.out.print("*");
            pattern1(r,c+1);
        }
        else
        {
            System.out.println();
            pattern1(r-1,0);
        }
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        invertedrtriangle(5,0);
    }
}
