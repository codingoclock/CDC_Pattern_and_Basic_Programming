class Main {
    static String check(int n)
    {
        if(n > 0){
            return "Positive";
        }
        else if( n < 0){
            return "Negative";
        }
        else
        {
            return "Zero";
        }
    }
    public static void main(String[] args) {
        System.out.println(check(-89));
        
    }
}
