import java.util.*;
class Main {
    static void printing(int n)
    {
        if(n == 0)
        {
            return;
        }
        
        System.out.printf("%d ",n);
        
        printing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n = sc.nextInt();
        printing(n);
    }
}
