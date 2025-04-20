import java.util.*;
class Main {
    static int gcd (int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int lcm (int a, int b)
    {
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("GCD: " + gcd(n,m));
        System.out.println("LCM: " + lcm(n,m));
    }
}
