 import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		    int n=sc.nextInt();
    		int a[]=new int[n];
    		for(int i=0;i<n-1;i++)
    		{
    		    a[i]=sc.nextInt();
    		}
		    for(int i=1;i<=n;i++)
		    {
		        int c=0;
		        for(int j=0;j<n-1;j++)
		        {
		            if(i==a[j])
		                c+=1;
		        }
		        if(c==0)
		        {
		            System.out.println(i);
		            break;
		        }
		    }
		    t-=1;
		}
		
    }   
    
}