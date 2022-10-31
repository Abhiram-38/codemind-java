import java.util.Scanner;
class sample
{
    public static int fun(int n)
    {
        int c=0;
        while(n!=0)
        {
            c+=1;
            n=n/10;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++)
		{
		    if(fun(a[i])%2==0)
		    {
		        c+=1;
		    }
		}
		System.out.println(c);
    }   
}