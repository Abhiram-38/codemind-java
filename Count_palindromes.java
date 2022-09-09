import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int x[],n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int d=0,res=0;
            int a=x[i];
            int temp=a;
            while(a!=0)
            {
                d=a%10;
                res=res*10+d;
                a=a/10;
            }
            if(res==temp){
                c++;
            }
        }
        System.out.println(c);
    }
}