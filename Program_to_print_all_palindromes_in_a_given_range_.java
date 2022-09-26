import java.util.Scanner;
class sample
{
    public static boolean pal(int n)
    {
        int temp=n,res=0;
        while(n!=0)
        {
            int d=n%10;
            res=res*10+d;
            n=n/10;
        }
        if(temp==res)
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
            if(pal(i))
            {
                System.out.print(i+" ");
            }
        }   
    }
}
