import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b,c;
        n=sc.nextInt();
        a=0;
        b=1;
        System.out.print(a+" "+b+" ");
        n=n-2;
        while(n--!=0)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}