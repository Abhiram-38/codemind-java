import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c1=0,c2=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=1;i<n-1;i+=2)
        {
            c1+=1;
            if((a[i-1]<a[i] && a[i]>a[i+1])||(a[i-1]>a[i] && a[i]<a[i+1]))
            {
                c2++;
            }
        }
        if (c1==c2)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}