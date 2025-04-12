import java.util.*;

public class Solution{
  static void righttriangle(int r, int c)
  {
    if(r == 0) return;
    if(c < r)
    {
      righttriangle(r,c+1);
      System.out.print("*");
    }
    else
    {
      righttriangle(r-1,0);
      System.out.println();
    }
  }
  public static void main(String [] args){
    righttriangle(5,0);
  }
}
