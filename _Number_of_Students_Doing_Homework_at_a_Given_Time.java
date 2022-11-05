import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int a[]=new int[n1];
		for(int i=0;i<n1;i++)
		    a[i]=sc.nextInt();
		int n2=sc.nextInt();
		int b[]=new int[n2];
		for(int i=0;i<n2;i++)
		    b[i]=sc.nextInt(); 
		int n3=sc.nextInt();
		int c=0;
		for(int i=0;i<n1;i++)
		{
		    if(n3>=a[i] && n3<=b[i])
		            c++;
		}
		System.out.println(c);
    } 
}