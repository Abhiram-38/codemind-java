import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int a=sc.nextInt();
            int res=0,temp=a;
            while(a!=0)
            {
                int d=a%10;
                res=res*10+d;
                a=a/10;
            }
            if(res==temp)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}