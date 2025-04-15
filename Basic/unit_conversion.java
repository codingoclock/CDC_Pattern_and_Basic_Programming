import java.util.*;
class Main {
    static void unitconversion()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Kg to g \n 2. cm to m");
        int n = sc.nextInt();
        
        switch(n)
        {
            case 1:
                System.out.println("Enter the kg:");
                int o = sc.nextInt();
                System.out.printf(" Gram = %d ",1000*o);
                break;
            case 2:
                System.out.println("Enter the cm");
                int s = sc.nextInt();
                System.out.printf("Metre = %d ", s/100);
                break;
            default:
                System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
        unitconversion();
        
    }
}
