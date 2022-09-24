import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i;
        for(i=a;i>=0;i--)
        {
            if(a%i==0 && b%i==0)
                break;
        }
        System.out.println((a*b)/i);
    }
}