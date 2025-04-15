class Main {
    static boolean validtriangle(int a,int b, int c)
    {
        if(a + b > c || b + c > a || c + a > b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(validtriangle(10,5,7));
        
    }
}
