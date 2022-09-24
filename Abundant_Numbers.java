import java.util.Scanner;
class sample
{
    public static int fact(int n)
    {
        int res=0,i;
        for(i=2;i<=(int)Math.pow(n,0.5);i++)
        {
            if(n%i==0)
            {
                res+=i;
                res+=n/i;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res;
        res=fact(n);
        if(res>n)
            System.out.println("True");
        else
            System.out.println("False");
    }
}