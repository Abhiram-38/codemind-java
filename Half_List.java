import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> b1=new ArrayList<>();
        int c=0;
        for(int i=0;i<n;i++)
        {
            a1.add(sc.nextInt());
        }
        for(int i=n/2;i<n;i++)
        {
            b1.add(a1.get(i));
        }
        Collections.reverse(b1);
        for(int i:b1)
        {
            System.out.print(i+" ");
        }
        for(int i=0;i<n/2;i++)
        {
            System.out.print(a1.get(i)+" ");
        }
    }
}