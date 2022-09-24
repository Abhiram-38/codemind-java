import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                c=1;
                System.out.println("not a prime");
                break;
            }
        }
        if(c==0)
        {
            System.out.println("prime");
        }
    }
}