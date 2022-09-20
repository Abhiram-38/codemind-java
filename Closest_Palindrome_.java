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
        int x,y;
        x=n-1;
        y=n+1;
        while(x!=0)
        {
            if(ispal(x))
            {
                break;
            }
            x--;
        }
        while(y!=0)
        {
            if(ispal(y))
            {
                break;
            }
            y++;
        }
        if(Math.abs(x-n)>Math.abs(y-n))
        {
            System.out.println(y);
        }
        else if(Math.abs(x-n)<Math.abs(y-n))
        {
            System.out.println(x);
        }
        else
        {
            System.out.print(x);
            System.out.print(' ');
            System.out.print(y);
        }
    }
}