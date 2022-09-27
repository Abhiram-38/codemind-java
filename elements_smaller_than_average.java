import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int a[]=new int[n];
        int i,sum=0,c=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum+=a[i];
        }
        int avg=sum/n;
        for(i=0;i<n;i++)
        {
            if(a[i]<=avg)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}