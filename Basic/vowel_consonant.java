class Main {
    static String voworcon(char b)
    {
        char out = Character.toLowerCase(b);
        if(out == 'a' || out == 'e' || out =='i' || out == 'o' || out =='u')
        {
            return "Vowel";
        }
        else
        {
            return "Consonant";
        }
    }
    public static void main(String[] args) {
        System.out.println(voworcon('A'));
        
    }
}
