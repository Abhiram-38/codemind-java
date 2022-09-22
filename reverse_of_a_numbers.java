import java.util.Scanner;
class asmple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0,temp=n;
        while(n!=0)
        {
            int d=n%10;
            res=res*10+d;
            n=n/10;
        }
        System.out.println(res);
    }
}