import java.util.*;
class xyz
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Character>a1=new ArrayList<>();
        a1.add('a');
        a1.add('e');
        a1.add('i');
        a1.add('o');
        a1.add('u');
        a1.add('A');
        a1.add('E');
        a1.add('I');
        a1.add('O');
        a1.add('U');
        char s=sc.nextLine().charAt(0);
        if(a1.contains(s)==true)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}