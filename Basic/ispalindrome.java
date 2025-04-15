class Main {
    static boolean ispalin(int n)
    {
        String m = Integer.toString(n);
        int l = 0;
        int r = m.length() - 1;
        while(l < m.length())
        {
            if(m.charAt(l) == m.charAt(r))
            {
                l++;
                r--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(ispalin(1001001));
    }
}
