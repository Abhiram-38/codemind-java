import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int res=0,temp=a;
        if(a<0)
            a=-a;
        while(a!=0)
        {
            int d=a%10;
            res=res*10+d;
            a=a/10;
        }
        if(temp<0)
            res=-res;
        System.out.println(res);
    }
}