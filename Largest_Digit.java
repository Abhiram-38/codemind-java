import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0,d;
        while(n!=0)
        {
            d=n%10;
            if(x<d)
                x=d;
            n=n/10;
        }
        System.out.print(x);
    }
}