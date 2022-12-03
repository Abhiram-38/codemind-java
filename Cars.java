import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=sc.nextInt();
        if(n2<n1)
            System.out.println("-1");
        else
        {
            int c1=x;
            int c2=0;
            int i=0;
            while(c2<=c1)
            {
                c1+=n1;
                c2+=n2;
                i+=1;
            }
            System.out.println(i);
        }
    }
}