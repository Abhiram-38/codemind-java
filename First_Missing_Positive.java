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
		int i=1;
		while(true)
		{
		    int c=0;
		    for(int j=0;j<n;j++)
		    {
		        if(i==a[j])
		            c+=1;
		    }
		    if(c==0)
		    {
		        System.out.println(i);
		        break;
		    }
		    i+=1;
		}
    }   
    
}