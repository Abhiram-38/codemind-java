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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        if(prime(n))
            System.out.println(0);
        else
        {
            int x=n+1;
            int y=n-1;
            while(x!=0)
            {
                if(prime(x))
                    break;
                x++;
            }
            while(y!=0)
            {
                if(prime(y))
                    break;
                y--;
            }
            if(Math.abs(x-n)>Math.abs(y-n))
                System.out.println(n-y);
            else
                    System.out.println(x-n);
        }
        
    }
}
