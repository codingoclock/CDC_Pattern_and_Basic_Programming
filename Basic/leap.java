class Main {
    static boolean isleap(int n)
    {
        boolean leap = false;
        if( n % 4 == 0)
        {
            if(n % 100 != 0 || n % 400 == 0)
            {
                leap = true;
            }
        }
        return leap;
    }
    public static void main(String[] args) {
        System.out.println(isleap(2000));
        
    }
}
