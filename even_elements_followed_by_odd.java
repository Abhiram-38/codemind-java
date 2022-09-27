import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int a[]=new int[n];
        int e[]=new int[n];
        int o[]=new int[n];
        int res[]=new int[n];
        int j=0,k=0,x=0,i=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
                e[j++]=a[i];
            else
                o[k++]=a[i];
        }
        for(i=0;i<j;i++)
            res[x++]=e[i];
        for(i=0;i<k;i++)
            res[x++]=o[i];
        for(i=0;i<x;i++)
            System.out.print(res[i]+" ");
    }
}