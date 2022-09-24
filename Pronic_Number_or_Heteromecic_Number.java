import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
                c=1;
                System.out.println("YES");
                break;
            }
        }
        if(c==0)
            System.out.println("NO");
    }
}