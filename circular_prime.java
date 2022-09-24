import java.util.Scanner;
class sample
{
    public static boolean prime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static boolean cprime(int n)
    {
        int temp=n,res=0;
        while(n!=0)
        {
            int d=n%10;
            res=res*10+d;
            n=n/10;
        }
        if(prime(temp) && prime(res))
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(prime(n) && cprime(n))
            System.out.println("circular prime");
        else if(prime(n))
            System.out.println("prime but not a circular prime");
        else
            System.out.println("not prime");
        
    }
}