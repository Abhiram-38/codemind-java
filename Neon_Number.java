import java.util.Scanner;
class sample
{
    public static int fun(int n)
    {
        int res=1;
        for(int i=1;i<=n;i++)
            res=res*i;
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,res=0;
        n=n*n;
        while(n!=0)
        {
            int d=n%10;
            res+=d;
            n=n/10;
        }
        if(res==temp)
            System.out.println("Neon Number");
        else
             System.out.println("Not Neon Number");
    }
}