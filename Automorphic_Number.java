import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,x=n*n,c=0,res=0,c1=0,res2=0;
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        n=temp;
        while(x!=0)
        {
            if(c1==c)
                break;
            int d=x%10;
            res=res*10+d;
            x=x/10;
            c1++;
        }
        while(res!=0)
        {
            int d=res%10;
            res2=res2*10+d;
            res=res/10;
        }
        if(res2==n)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
}