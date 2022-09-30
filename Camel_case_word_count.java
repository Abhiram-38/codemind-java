import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                c++;
        }
        if(Character.isLowerCase(s.charAt(0)))
            System.out.println(c+1);
        else
            System.out.println(c);
    }
}