import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int k=0;
		for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		   b[k++]=a[i]*a[i]; 
		}
		int temp;
    	for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(b[j]>b[j+1])
                {
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
		for(int i=0;i<n;i++)
		    System.out.print(b[i]+" ");
    } 
}