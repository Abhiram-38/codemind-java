import java.util.Scanner;
class sample
{
    public static boolean adam(int n)
    {
        int temp=n;
        int x=n*n,res1=0,res2=0;
        while(n!=0)
        {
            int d=n%10;
            res1=res1*10+d;
            n=n/10;
        }
        res1=res1*res1;
        while(res1!=0)
        {
            int d=res1%10;
            res2=res2*10+d;
            res1=res1/10;
        }
        if(res2==x)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(adam(n))
            System.out.println("True");
        else
            System.out.println("False");
    }
}