class Main {
    static void voworcon2(char c)
    {
        char out = Character.toLowerCase(c);
        switch(out)
        {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
    public static void main(String[] args) {
        voworcon2('Z'); //Consonant
        
    }
}
