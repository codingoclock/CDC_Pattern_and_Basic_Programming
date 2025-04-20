import java.util.*;
class Main {
    static int fib(int n)
    {
        if(n < 2)
        {
            return n;
        }
        else
        {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The Nth term of series is: " + fib(n));
    }
}
