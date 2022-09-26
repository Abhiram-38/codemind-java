import java.util.Scanner;
class sample
{
    public static int fact(int n)
    {
        int res=1;
        for(int i=1;i<=n;i++)
        {
            res=res*i;
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            int res=fact(n);
            System.out.println(res);
        }
    }
}
