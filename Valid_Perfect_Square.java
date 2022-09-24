import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            int x=(int)Math.sqrt(n);
            if(n==x*x)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
