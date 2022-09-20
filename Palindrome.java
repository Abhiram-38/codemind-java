import java.util.*;
class sample
{
    public static boolean ispal(int n)
    {
        int res=0;
        int temp=n;
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
        int n=sc.nextInt();
        if(ispal(n))
            System.out.println("True");
        else
            System.out.println("False");
    }
}