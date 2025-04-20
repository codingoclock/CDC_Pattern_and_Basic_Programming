import java.util.*;
class Main {
    static int sums(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n = sc.nextInt();
        System.out.println(sums(n));
    }
}
