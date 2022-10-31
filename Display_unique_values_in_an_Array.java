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
		int x=0;
		for(int i=0;i<n;i++)
		{
		    int c=0;
		    for(int j=0;j<n;j++)
		    {
		        if(a[i]==a[j])
		        {
		            c+=1;
		        }
		    }
		    if(c==1)
		    {
		        System.out.print(a[i]+" ");
		        x=1;
		    }
		}
		if(x==0)
		{
		    System.out.println(-1);
		}
		
    }   
}