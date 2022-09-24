import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int di=(int)Math.log10(n);
        int x=1,res=0;
        while(n!=0)
        {
            int d=n/(int)Math.pow(10,di);
            res+=(int)Math.pow(d,x++);
            n=n%(int)Math.pow(10,di);
            di--;
        }
        if(temp==res)
            System.out.print("True");
        else
            System.out.print("False");
    }
}