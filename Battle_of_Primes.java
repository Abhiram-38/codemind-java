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
		int a=sc.nextInt();
        int b=sc.nextInt();
        int x=a+b,c=x;
        while(++x!=0)
        {
            if(prime(x))
                break;
        }
        System.out.println(x-c);
    }
}
