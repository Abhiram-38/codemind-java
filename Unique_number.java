import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        int i=0,c=0;
        while(n!=0)
        {
            int d=n%10;
            a[i++]=d;
            n=n/10;
        }
        for(int k=0;k<i;k++)
        {
            for(int j=k+1;j<i;j++)
            {
                if(a[k]==a[j])
                    c=1;
            }
        }
        if(c==0)
            System.out.println("Unique Number");
        else
            System.out.println("Not Unique Number");
    }
}