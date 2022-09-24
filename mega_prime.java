import java.util.Scanner;
class sample
{
    public static boolean prime(int n)
    {
        if(n<2)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c1=0,c2=0;
        if(prime(n))
        {
            while(n!=0)
            {
                c1++;
                int d=n%10;
                if(prime(d))
                    c2++;
                n=n/10;
            }
            if(c1==c2)
                System.out.println("Mega Prime");
            else
                System.out.println("Not Mega Prime");
        }
        else
            System.out.println("Not Mega Prime");
    }
}