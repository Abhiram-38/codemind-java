import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a1=new ArrayList<>();
        int c=0;
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            if(x==0)
                c+=1;
            else
                a1.add(x);
        }
        
        //Collections.sort(a1);
        for(int i:a1)
        {
            System.out.print(i+" ");
        }
        if(c>0)
        {
            for(int i=1;i<=c;i++)
            {
                System.out.print(0+" ");
            }    
        }
    }
}