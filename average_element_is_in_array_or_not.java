import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0,c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        sum=sum/n;
        for(int i=0;i<n;i++)
        {
            if(a[i]==sum)
            {
                c=1;
                break;
            }
        }
        if(c==1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
