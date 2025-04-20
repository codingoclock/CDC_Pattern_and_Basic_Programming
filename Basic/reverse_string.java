import java.util.*;
class Main {
    public static String reverse(String str)
    {
        if(str.isEmpty()){
            return str;
        }
        else{
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the numbers: ");
        // int n = sc.nextInt();
        System.out.println(reverse("hello"));
    }
}
