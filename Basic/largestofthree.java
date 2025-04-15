class Main {
    static void find(int a, int b, int c)
    {
        if(a > b && a > c){
            System.out.printf("%d is greatest.",a);
        }
        else if(b > a && b > c){
            System.out.printf("% d is greatest",b);
        }
        else
        {
            System.out.printf("%d is greatest",c);
        }
    }
    public static void main(String[] args) {
        find(3,5,9);
        
    }
}
