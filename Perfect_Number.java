import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                res+=i;
        }
        if(res==n)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
