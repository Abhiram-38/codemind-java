import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>e=new ArrayList<>();
        ArrayList<Integer>o=new ArrayList<>();
        for(int i=0;i<n;i++)
            a.add(sc.nextInt());
        for(int i:a)
        {
            if(i%2==0)
                e.add(i);
            else
                o.add(i);
        }
        int x=e.size();
        int y=o.size();
        for(int i=0;i<Math.min(x,y);i++)
        {
            System.out.print(o.get(i)+" "+e.get(i)+" ");
        }
        if(x>y)
        {
            for(int i=y;i<x;i++)
                System.out.print(e.get(i)+" ");
        }
        else
        {
            for(int i=x;i<y;i++)
                System.out.print(o.get(i)+" ");
        }
        if(n%2!=0)
            System.out.print(0);
    }
}