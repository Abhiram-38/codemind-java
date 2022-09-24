import java.util.Scanner;
class sample
{
    public static boolean fun(int n)
    {
        int c1=0,c2=0,t=n;
        while(n!=0)
        {
            c1++;
            int d=n%10;
            if(d==0)
            {
                n=n/10;
                continue;
            }
            if(t%d==0)
                c2++;
            n=n/10;
        }
        if(c1==c2)
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(fun(i))
                System.out.print(i+" ");
        }
    }
}
