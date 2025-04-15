import java.util.*;
class Main {
    static String check(char c)
    {
        if(Character.isUpperCase(c))
        {
            return "Uppercase";
        }
        else if(Character.isLowerCase(c))
        {
            return "Lowercase";
        }
        else
        {
            return "Special Character";
        }
    }
    public static void main(String[] args) {
        System.out.println(check('&'));
    }
}
