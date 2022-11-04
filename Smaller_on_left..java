 import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		System.out.print(-1+" ");
		for(int i=1;i<n;i++)
		{
		    int min=a[i];
		    for(int j=i-1;j>=0;j--)
		    {
		        if(a[j]<min)
		        {
		            min=a[j];
		            break;
		        }
		    }
		    if(min==a[i])
		        System.out.print(-1+" ");
		    else
		        System.out.print(min+" ");
		}
    }   
}