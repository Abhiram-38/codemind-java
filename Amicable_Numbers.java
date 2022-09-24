import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,res1=0,res2=0,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<a;i++)
        {
            if(a%i==0)
                res1+=i;
        }
        for(i=1;i<b;i++)
        {
            if(b%i==0)
                res2+=i;
        }
        if(res1==b && res2==a)
            System.out.println("Amicable");
        else
            System.out.println("Not Amicable");
    }
}